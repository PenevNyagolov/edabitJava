//Profitable Gamble
//Create a function that takes in three arguments (prob, prize, pay) and returns true if prob * prize > pay; otherwise return false.
//
//To illustrate, profitableGamble(0.2, 50, 9) should yield true, since the net profit is 1 (0.2 * 50 - 9), and 1 > 0.
//
//Examples
//profitableGamble(0.2, 50, 9) ➞ true
//
//profitableGamble(0.9, 1, 2) ➞ false
//
//profitableGamble(0.9, 3, 2) ➞ true

package porfitable_gamble;


public class Porfitable_gamble {

    
    public static void main(String[] args) {
        
        System.out.println(profitableGamble(0.2,50,9));
    }
   
	public static boolean profitableGamble(double prob, double prize, double pay) {
		double argum = (prob * prize) - pay;
		return argum > 0 ? true : false;
	}

}
