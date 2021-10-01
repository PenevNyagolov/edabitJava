//Both Zero, Negative or Positive
//Write a function that returns true if both numbers are:
//
//Smaller than 0, OR ...
//Greater than 0, OR ...
//Exactly 0
//Otherwise, return false.
//
//Examples
//both(6, 2) ➞ true
//
//both(0, 0) ➞ true
//
//both(-1, 2) ➞ false
//
//both(0, 2) ➞ false
//Notes
//Inputs will always be two numbers.
package bothzeronegativeorpositive;

public class BothZeroNegativeOrPositive {

    public static void main(String[] args) {

        System.out.println(both(0, 2));
    }

    public static boolean both(int n1, int n2) {
        int a = Integer.signum(n1);
        int b = Integer.signum(n2);
        
        if(a == b){
            return true;
        }else if(a < b){
            return false;
        }else{
            return false;
        }
    }
}
