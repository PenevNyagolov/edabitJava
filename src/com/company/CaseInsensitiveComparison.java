//Case Insensitive Comparison
//Write a function that validates whether two strings are identical. Make it case insensitive.
//
//Examples
//match("hello", "hELLo") ➞ true
//
//match("motive", "emotive") ➞ false
//
//match("venom", "VENOM") ➞ true
//
//match("mask", "mAskinG") ➞ false


package caseinsensitivecomparison;

public class CaseInsensitiveComparison {

    public static void main(String[] args) {
        System.out.println(match("motive", "emotive"));
    }
    public static boolean match(String str1, String str2) {
		return str1.equalsIgnoreCase(str2);
  }
}
