package Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmojiFactoryFlyweight {

    private static final Map<String, Emoji> list = new HashMap<>();

    public static Emoji getEmoji(String symbol){
        Emoji emoji = list.get(symbol);
        if(emoji == null){
            emoji = new Emoji(symbol);
            list.put(symbol, emoji);
        }
        return emoji;
    }
}
