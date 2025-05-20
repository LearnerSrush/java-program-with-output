//P1.Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not.
import java.util.*;

public class ColorCheck {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");

        System.out.println(colors);

        if (colors.contains("red")) {
            System.out.println("available");
        } else {
            System.out.println("not available");
        }
    }
}
