//To the Power of _____
//Create a function that takes a base number and an exponent number and returns the calculation.
//
//Examples
//calculateExponent(5, 5) ➞ 3125
//
//calculateExponent(10, 10) ➞ 10000000000
//
//calculateExponent(3, 3) ➞ 27

package tothepowerof;


public class ToThePowerOf {

    
    public static void main(String[] args) {
        System.out.println(calculateExponent(5,5));
    }
    public static int calculateExponent(int num, int exp) {
        //int a =  (int) Math.pow(num, exp));
		return (int) Math.pow(num, exp);
	}
}
