//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

public class WordCounter {
 public static int countWords(String str) {
 if (str == null || str.trim().isEmpty()) return 0;
 return str.trim().split("\\s+").length;
 }
 public static void main(String[] args) {
 String str = "Java is awesome!";
 System.out.println("Word count: " + countWords(str));
 }
} 
