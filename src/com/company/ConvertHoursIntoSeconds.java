//Convert Hours into Seconds
//Write a function that converts hours into seconds.
//
//Examples
//howManySeconds(2) ➞ 7200
//
//howManySeconds(10) ➞ 36000
//
//howManySeconds(24) ➞ 86400
//Notes
//60 seconds in a minute, 60 minutes in an hour
//Don't forget to return your answer.

package converthoursintoseconds;

/**
 *
 * @author tihomir
 */
public class ConvertHoursIntoSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(howManySeconds(2));
    }
    public static int howManySeconds(int hours) {
		return (hours * 60) * 60;
  }
}
