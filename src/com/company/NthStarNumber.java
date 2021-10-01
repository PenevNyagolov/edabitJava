//Nth Star Number
//Create a method that takes a positive integer and returns the nth "star number".
//
//A star number is a centered figurate number a centered hexagram (six-pointed star), such as the one that Chinese checkers is played on.
//
//Examples
//starNumber(2) ➞ 13
//
//starNumber(3) ➞ 37
//
//starNumber(5) ➞ 121

package nthstarnumber;


public class NthStarNumber {

    public static void main(String[] args) {
        System.out.println(starNumber(5));
    }
    public static int starNumber(int n) {
		return 6 * n * (n - 1) + 1;
  }
}
