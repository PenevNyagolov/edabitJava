//Is the Number Less than or Equal to Zero?
//Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
//
//Examples
//lessThanOrEqualToZero(5) ➞ false
//
//lessThanOrEqualToZero(0) ➞ true
//
//lessThanOrEqualToZero(-2) ➞ true

package numberlessthanorequaltozero;

/**
 *
 * @author tihomir
 */
public class NumberLessThanOrEqualToZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(lessThanOrEqualToZero(-2));
    }
    public static boolean lessThanOrEqualToZero(int num) {
      
        if(num > 0){
        return false;
        }else{
        return true;
        }
        
        
    }
}
