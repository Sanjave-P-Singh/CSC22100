
import java.awt.Color;
import java.util.Random;
public class Main{
    public static void main(String[] args) {

        MyColor[] myColors = MyColor.getMyColors();

        //Pick up a color
        MyColor color = myColors[25];
        System.out.println(color);
        System.out.println(color.print());
        System.out.println(color + "(" + color.getR() + ", " + color.getG() + ", " + color.getB() + ", " + color.getA() + ")"
                + "Hexadecimal Code: " + color.getHexColor());

        Color awtColor = color.getAWTColor();
        System.out.println(awtColor);
        System.out.println("(" + awtColor.getRed() + ", " + awtColor.getGreen() + ", " + awtColor.getBlue() + ", " + awtColor.getAlpha() + ")" + '\n');

        // Generates a random color
        System.out.println("Random Color: " + MyColor.getRandomColor().print());
    }
}
