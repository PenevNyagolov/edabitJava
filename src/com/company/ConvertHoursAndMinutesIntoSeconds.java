//Convert Hours and Minutes into Seconds
//Write a function that takes two integers (hours, minutes) and converts them into seconds.
//
//Examples
//convert(1, 3) ➞ 3780
//
//convert(2, 0) ➞ 7200
//
//convert(0, 0) ➞ 0

package converthoursandminutesintoseconds;

/**
 *
 * @author tihomir
 */
public class ConvertHoursAndMinutesIntoSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(convert(1,3));
    }
    public static int convert(int hours, int minutes) {
		return (hours * 60 * 60) + (minutes * 60); 
  }

}
