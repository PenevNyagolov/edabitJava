//Convert Minutes into Seconds
//Write a function that takes an integer minutes and converts it to seconds.
//
//Examples
//convert(5) ➞ 300
//
//convert(3) ➞ 180
//
//convert(2) ➞ 120
//Notes
//Don't forget to return the result.
package convertminutesintoseconds;


public class ConvertMinutesIntoSeconds {

    
    public static void main(String[] args) {
        System.out.println(convert(5));
    }
    public static int convert(int minutes) {
		return minutes * 60;
  }
    
}
