//Multiple of 100
//Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.
//
//Examples
//divisible(1) ➞ false
//
//divisible(1000) ➞ true
//
//divisible(100) ➞ true
package multipleof100;

/**
 *
 * @author tihomir
 */
public class MultipleOf100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(divisible(100));
    }

    public static boolean divisible(int num) {
        if (num % 100 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
