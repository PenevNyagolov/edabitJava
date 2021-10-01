//Return the Next Number from the Integer Passed
//Create a function that takes a number as an argument, increments the number by +1 and returns the result.
//
//Examples
//addition(0) ➞ 1
//
//addition(9) ➞ 10
//
//addition(-3) ➞ -2

package returnthenextnumberfromtheintegerpassd;

/**
 *
 * @author tihomir
 */
public class ReturnTheNextNumberFromTheIntegerPassd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(addition(-3));
    }
    public static int addition(int num) {
		return num + 1;
	}
}
