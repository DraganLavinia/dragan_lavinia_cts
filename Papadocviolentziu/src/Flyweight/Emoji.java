package Flyweight;

import com.sun.source.tree.IdentifierTree;

public class Emoji implements IEmojiFlyweight{
    private final String symbol;


    public Emoji(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(EmojiDetails details) {
        System.out.printf("Emoji %s afisat la pozitia x=%d, y=%d",
                symbol, details.x, details.y);
    }
}
