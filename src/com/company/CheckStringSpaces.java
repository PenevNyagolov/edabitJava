//Check String for Spaces
//Create a function that returns true if a string contains any spaces.
//
//Examples
//hasSpaces("hello") ➞ false
//
//hasSpaces("hello, world") ➞ true
//
//hasSpaces(" ") ➞ true
//
//hasSpaces("") ➞ false
//
//hasSpaces(",./!@#") ➞ false
//Notes
//An empty string does not contain any spaces.
//Try doing this without RegEx.

package checkstringspaces;

/**
 *
 * @author tihomir
 */
public class CheckStringSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hasSpaces("hello, world"));
    }
    public static boolean hasSpaces(String str) {
		return str.contains(" ");
	}
}
