//P5 Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index.

import java.util.*;

public class RemoveElementDemo {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("green");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        int n = 3; 
        String str = "green";

        System.out.println("Original list:");
        System.out.println(colors);

        System.out.println("Removing the element \"" + str + "\": " + colors.remove(str));
        
        System.out.println("Updated list:");
        System.out.println(colors);
    }
}
