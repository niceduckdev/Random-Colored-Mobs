package niceduckdev.randomcoloredmobs;

import org.bukkit.DyeColor;

import java.util.Random;

public class Utilities {
    public static DyeColor RandomColor() {
        DyeColor[] colors = {
                DyeColor.WHITE,
                DyeColor.ORANGE,
                DyeColor.MAGENTA,
                DyeColor.LIGHT_BLUE,
                DyeColor.YELLOW,
                DyeColor.LIME,
                DyeColor.PINK,
                DyeColor.GRAY,
                DyeColor.LIGHT_GRAY,
                DyeColor.CYAN,
                DyeColor.PURPLE,
                DyeColor.BLUE,
                DyeColor.BROWN,
                DyeColor.GREEN,
                DyeColor.RED,
                DyeColor.BLACK
        };

        int random = new Random().nextInt(colors.length);
        return colors[random];
    }
}
