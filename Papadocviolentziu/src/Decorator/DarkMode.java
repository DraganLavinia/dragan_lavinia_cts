package Decorator;

public class DarkMode extends ADecoratorTab{
    public DarkMode(ITab itab) {
        super(itab);
    }

    @Override
    public void display() {
        System.out.println("Dark mode activated...");
        ref.display();
    }
}
