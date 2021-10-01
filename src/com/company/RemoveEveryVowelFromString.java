//Remove Every Vowel from a String
//Create a function that takes a string and returns a new string with all vowels removed.
//
//Examples
//removeVowels("I have never seen a thin person drinking Diet Coke.")
//➞ " hv nvr sn  thn prsn drnkng Dt Ck."
//
//removeVowels("We're gonna build a wall!")
//➞ "W'r gnn bld  wll!"
//
//removeVowels("Happy Thanksgiving to all--even the haters and losers!")
//➞ "Hppy Thnksgvng t ll--vn th htrs nd lsrs!"
//Notes
//"y" is not considered a vowel.
//Expect a valid string for all test cases.

package removeeveryvowelfromstring;

/**
 *
 * @author tihomir
 */
public class RemoveEveryVowelFromString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(removeVowels("We're gonna build a wall!"));
    }
    public static String removeVowels(String s) {
		return s.replaceAll("[aeiouAEIOU]", "");
	}
}
