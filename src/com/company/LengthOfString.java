//Recursion: Length of a String
//Write a function that returns the length of a string. Make your function recursive.
//
//Examples
//length("apple") ➞ 5
//
//length("make") ➞ 4
//
//length("a") ➞ 1
//
//length("") ➞ 0

package lengthofstring;


public class LengthOfString {

   
    public static void main(String[] args) {
        System.out.println(length("make"));
    }
    public static int length(String str) {
		return str.length();
	}
}
