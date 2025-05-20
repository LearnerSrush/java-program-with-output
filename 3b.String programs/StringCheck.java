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

