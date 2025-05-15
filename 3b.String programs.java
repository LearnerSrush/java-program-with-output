//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().

public class StringCheck {
 public static boolean isNullOrEmpty(String str) {
 return str == null || str.trim().isEmpty();
 }
 public static void main(String[] args) {
 String str1 = " ";
 String str2 = null;
 String str3 = "Hello";
 System.out.println("str1 is empty: " + isNullOrEmpty(str1));
 System.out.println("str2 is empty: " + isNullOrEmpty(str2));
 System.out.println("str3 is empty: " + isNullOrEmpty(str3));
 }
}

//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

public class SubstringCounter {
 public static int countOccurrences(String mainStr, String subStr) {
 if (mainStr == null || subStr == null || subStr.isEmpty()) return 0;

 int count = 0, index = 0;
 while ((index = mainStr.indexOf(subStr, index)) != -1) {
 count++;
 index += subStr.length();
 }
 return count;
 }
 public static void main(String[] args) {
 String mainStr = "Java is fun. Java is powerful. Java!";
 String subStr = "Java";
 System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
 }
} 


//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

public class StringReverser {
 public static String reverseString(String str) {
 return new StringBuilder(str).reverse().toString();
 }
 public static void main(String[] args) {
 String str = "Hello World";
 System.out.println("Reversed: " + reverseString(str));
 }
}

//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():

public class PalindromeChecker {
 public static boolean isPalindrome(String str) {
 if (str == null) return false;

 str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 return str.equals(new StringBuilder(str).reverse().toString());
 }
 public static void main(String[] args) {
 String str = "A man, a plan, a canal, Panama";
 System.out.println("Is palindrome: " + isPalindrome(str));
 }
}
//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()

public class WhitespaceRemover {
 public static String removeWhitespace(String str) {
 return str.replaceAll("\\s+", "");
 }
 public static void main(String[] args) {
 String str = " Hello World ";
 System.out.println("Without whitespace: " + removeWhitespace(str));
 }
} 


