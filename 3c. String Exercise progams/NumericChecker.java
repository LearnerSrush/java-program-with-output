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

