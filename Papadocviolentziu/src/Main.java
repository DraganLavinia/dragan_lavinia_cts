import Decorator.AdBlocker;
import Decorator.DarkMode;
import Decorator.ITab;
import Decorator.Tab;
import Flyweight.Emoji;
import Flyweight.EmojiDetails;
import Strategy.BrowserRenderer;
import Strategy.HighFidelity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pattern 1 - flyweight

        EmojiDetails emojiDetails = new EmojiDetails(20,30);
        Emoji emoji = new Emoji("\uD83D\uDE02");
        emoji.display(emojiDetails);
        System.out.println("\n--------------------------------\n");
        //pattern 2 - decorator

        ITab simpleTab = new Tab("Youtube");

        ITab premiunTab = new DarkMode(simpleTab);

        premiunTab.display();
        System.out.println("\n--------------------------------\n");
        ITab premiunTab2 = new DarkMode(new AdBlocker(simpleTab));

        premiunTab2.display();
        System.out.println("--------------------------------\n");
        //pattern 3 - strategy

        BrowserRenderer browser = new BrowserRenderer();

        browser.setStrategy(new HighFidelity());
        browser.renderPage();

    }
}