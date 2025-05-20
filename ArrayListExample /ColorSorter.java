//P3.Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;

public class ColorSorter {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println("Before sorting:");
        System.out.println(colors);

        Collections.sort(colors);

        System.out.println("After sorting:");
        System.out.println(colors);
    }
}

