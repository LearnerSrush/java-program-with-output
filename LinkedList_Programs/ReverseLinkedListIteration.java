//2.Linked List Program = Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListIteration {

    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("green"); 
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println("Reverse iteration using ListIterator:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nReverse iteration using descendingIterator:");
        Iterator<String> descendingIterator = colors.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
