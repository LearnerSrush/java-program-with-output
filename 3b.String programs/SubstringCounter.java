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

