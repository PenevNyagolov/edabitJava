//Check Factors
//Write a function that returns true if all integers in an array are factors of a number, and false otherwise.
//
//Examples
//checkFactors([2, 3, 4], 12) ➞ true
//// Since 2, 3, and 4 are all factors of 12.
//
//checkFactors([1, 2, 3, 8], 12) ➞ false
//// 8 is not a factor of 12.
//
//checkFactors([1, 2, 50], 100) ➞ true
//
//checkFactors([3, 6], 9) ➞ false
package checkfactors;

/**
 *
 * @author tihomir
 */
public class CheckFactors {

    public static void main(String[] args) {
        int[] factors = {1,2, 3, 8};
        System.out.println(checkFactors(factors,12));
    }

    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0; i <= factors.length; i++) {
            if (num % factors[i] != 0) {
                return false;
               // continue;
            }
            //continue;
        }
        return true;
    }
}
