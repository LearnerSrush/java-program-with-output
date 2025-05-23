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
