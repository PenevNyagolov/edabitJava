//Return a String as an Integer
//Create a function that takes a string and returns it as an integer.
//
//Examples
//stringInt("6") ➞ 6
//
//stringInt("1000") ➞ 1000
//
//stringInt("12") ➞ 12
//Notes
//All numbers will be whole numbers.

package returnstringinteger;

/**
 *
 * @author tihomir
 */
public class ReturnStringInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("12");
    }
    public static int stringInt(String str) {
	return Integer.valueOf(str);	
	}
}
