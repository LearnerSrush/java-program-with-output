//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()

public class Capitalizer {
 public static String capitalizeWords(String str) {
 String[] words = str.split("\\s+");
 StringBuilder result = new StringBuilder();

 for (String word : words) {
 if (!word.isEmpty()) {
 result.append(Character.toUpperCase(word.charAt(0)))
 .append(word.substring(1)).append(" ");
 }
 }
 return result.toString().trim();
 }
 public static void main(String[] args) {
 String str = "hello world, java is fun!";
 System.out.println("Capitalized: " + capitalizeWords(str));
 }
} 

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

//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()

public class NumericChecker {
 public static boolean isNumeric(String str) {
 return str.matches("\\d+");
 }
 public static void main(String[] args) {
 String str = "12345";
 String str2 = "123a5";
 System.out.println("Is numeric (str1): " + isNumeric(str));
 System.out.println("Is numeric (str2): " + isNumeric(str2));
 }
} 


//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

import java.util.Random;
public class RandomStringGenerator {
 public static String generateRandomString(int length) {
 String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 StringBuilder result = new StringBuilder();
 Random random = new Random();
 for (int i = 0; i < length; i++) {
 result.append(chars.charAt(random.nextInt(chars.length())));
 }
 return result.toString();
 }
 public static void main(String[] args) {
 System.out.println("Random String: " + generateRandomString(10));
 }
} 

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
