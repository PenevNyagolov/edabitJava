//Flip the Boolean
//Create a function that reverses a boolean value.
//
//Examples
//reverse(true) ➞ false
//
//reverse(false) ➞ true

package flipboolean;

/**
 *
 * @author tihomir
 */
public class FlipBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverse(true));
    }
    public static boolean reverse(boolean b) {
		return !b;
	}
}
