//Leap Years
//A leap year has one day added to February for being synchronized with the seasonal year. A leap year appears with a regular frequency, which is determined by the rule below:
//
//A year must either be divisible by 400 or divisible by 4 and not 100.
//Given a year you must implement a function that returns true if it's a leap year, or false if it's not.
//
//Examples
//isLeap(2020) ➞ true
//// Exactly divided by 4 and not by 100.
//
//isLeap(1800) ➞ false
//// Exactly divided by 4, but is also exactly divided by 100.
//
//isLeap(2000) ➞ true
//// Exactly divided by 400.
//
//isLeap(2019) ➞ false
//// It can't be exactly divided by 400 or by 4.
package leapyars;

/**
 *
 * @author tihomir
 */
public class LeapYars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isLeap(2020));
    }

    public static boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
