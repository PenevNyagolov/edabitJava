//Less Than 100?
//Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
//
//Examples
//lessThan100(22, 15) ➞ true
//// 22 + 15 = 37
//
//lessThan100(83, 34) ➞ false
//// 83 + 34 = 117

package lessthan100;

/**
 *
 * @author tihomir
 */
public class LessThan100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(lessThan100(21,79));
    }
    public static boolean lessThan100(int a, int b) {
		int sum = a + b;
                
                if(sum >= 100){
                return false;
                }else{
                return true;
                }
  }
}
