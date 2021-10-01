//Re-Form the Word
//A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.
//
//Examples
//getWord("seas", "onal") ➞ "Seasonal"
//
//getWord("comp", "lete") ➞ "Complete"
//
//getWord("lang", "uage") ➞ "Language"

package re.formtheword;

/**
 *
 * @author tihomir
 */
public class ReFormTheWord {

    
    public static void main(String[] args) {
        System.out.println(getWord("seas", "onal"));
    }
    public static String getWord(String left, String right) {
		return left.substring(0,1).toUpperCase() + left.substring(1,4) + right.substring(0,4);
	}
}
