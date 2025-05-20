//1.Linked List Program = Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

import java.util.*;

public class ListIteratorDemo {

    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        Iterator<String> iterator = colors.listIterator(2);

        System.out.println("Elements starting from index 2:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

