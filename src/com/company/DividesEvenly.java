//Divides Evenly
//Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.
//
//Examples
//dividesEvenly(98, 7) ➞ true
//# 98/7 = 14
//
//dividesEvenly(85, 4) ➞ false
//# 85/4 = 21.25
package dividesevenly;

/**
 *
 * @author tihomir
 */
public class DividesEvenly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println(2 % 49);
        System.out.println(dividesEvenly(98, 49));
    }

    public static boolean dividesEvenly(int a, int b) {
        //return (a / b) % b;
        if ((a % b) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
