//Check if an Integer is Divisible By Five
//Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
//
//Examples
//divisibleByFive(5) ➞ true
//
//divisibleByFive(-55) ➞ true
//
//divisibleByFive(37) ➞ false

package checkifintegerdivisiblebyfive;

/**
 *
 * @author tihomir
 */
public class CheckIfIntegerDivisibleByFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(divisibleByFive(-55));
    }
   public static boolean divisibleByFive(int num) {
	if(num % 5 == 0){
        return true;
        }
        else{
        return false;
        }	
	} 
}
