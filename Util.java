import greenfoot.*;
import java.awt.Color;
public class Util {
    public static Color getRandomColor() {
        return new Color(
            Greenfoot.getRandomNumber(256),
            Greenfoot.getRandomNumber(256),
            Greenfoot.getRandomNumber(256));
    }
}
