//Are the Numbers Equal?
//Create a function that takes two integers and checks if they are equal.
//
//Examples
//isEqual(5, 6) ➞ false
//
//isEqual(1, 1) ➞ true
//
//isEqual(36, 35) ➞ false

package arenumberequals;

/**
 *
 * @author tihomir
 */
public class AreNumberEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isEqual(9,2));
    }
    public static boolean isEqual(int num1, int num2) {
		return num1 == num2;
  }
}
