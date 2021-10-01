package easy;

import java.util.Arrays;

public class betweenWord {

    public static void main(String[] args) {

        System.out.println(isBetween("apple", "banana", "azure"));

    }
    public static boolean isBetween(String first, String last, String word) {
		
		return first.compareTo(word) < 0 && last.compareTo(word) > 0;
 
  }
}
// isBetween("apple", "banana", "azure") ➞ true

// isBetween("monk", "monument", "monkey") ➞ true

// isBetween("bookend", "boolean", "boost") ➞ false
