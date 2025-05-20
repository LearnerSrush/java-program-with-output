//P2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList.

import java.util.*;

public class ColorListManager {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("geen"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println("Original list: " + colors);

        colors.remove(2); // Removes "pink"
        System.out.println("After removing element at index 2: " + colors);

        colors.remove("Blue"); // Removes "Blue"
        System.out.println("After removing 'Blue': " + colors);
    }
}
