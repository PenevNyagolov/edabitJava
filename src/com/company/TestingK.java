//Testing K^K == N?
//Write a function that returns true if k^k == n for input (n, k) and return false otherwise.
//
//Examples
//kToK(4, 2) ➞ true
//
//kToK(387420489, 9) ➞ true
//// 9^9 == 387420489
//
//kToK(3124, 5) ➞ false
//
//kToK(17, 3) ➞ false
//Notes
//The ^ operator refers to exponentiation operation, not the bitwise XOR

package testingk;

/**
 *
 * @author tihomir
 */
public class TestingK {

    
    public static void main(String[] args) {
        System.out.println(kToK(4, 2));
    }
    public static boolean kToK(int n, int k) {
		int intResult = (int) Math.pow(k, k);
		return intResult == n;
  }
}
