//Convert Number to String of Dashes
//Create a function that takes a number (from 1 - 60) and returns a corresponding string of hyphens.
//
//Examples
//Go(1) ➞ "-"
//
//Go(5) ➞ "-----"
//
//Go(3) ➞ "---"
//Notes
//You will be provided integers ranging from 1 to 60.
//Don't forget to return your result as a string.
//If you get stuck on a challenge, find help in the Resources tab.
//If you're really stuck, unlock solutions in the Solutions tab.


package convertnumbertostringofdashes;

public class ConvertNumberToStringOfDashes {

    
    public static void main(String[] args) {
        System.out.println(Go(9));
    }
    public static String Go(int num) {
		String myDash = "";

            for (int i = 1; i <= num; i++) {
                myDash = myDash + "-";
            }
            return myDash;
	}
}
