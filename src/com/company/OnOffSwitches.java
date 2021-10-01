//On/Off Switches
//Create a function that returns how many possible outcomes can come from a certain number of switches (on / off).
//
//Examples
//posCom(1) ➞ 2
//
//posCom(3) ➞ 8
//
//posCom(10) ➞ 1024
//Notes
//All numbers will be whole and positive.

package onoffswitches;

public class OnOffSwitches {

   
    public static void main(String[] args) {
        System.out.println(posCom(3));
    }
    public static int posCom(int n) {
		int intResult = (int) Math.pow(2, n);
                return intResult;
	}
}
