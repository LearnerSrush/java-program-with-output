//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()

public class StringTruncator {
 public static String truncate(String str, int length) {
 if (str.length() <= length) return str;
 return str.substring(0, length) + "...";
 }
 public static void main(String[] args) {
 String str = "Java is a powerful programming language.";
 System.out.println("Truncated: " + truncate(str, 10));
 }
} 

