//P4.Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
  
import java.util.*;

public class SubListExample {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println("Original list:");
        System.out.println(colors);

        System.out.println("Using subList (from index 0 to 2):");
        System.out.println(colors.subList(0, 2));
    }
}


