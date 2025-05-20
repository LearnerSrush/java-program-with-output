//3.Linked List Program = Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))

import java.util.*;

public class InsertAtEndDemo {

    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println("Original list:");
        System.out.println(colors);

        // Inserting element at the end using offerLast()
        colors.offerLast("Pink");

        System.out.println("List after inserting 'Pink' at the end:");
        System.out.println(colors);
    }
}

