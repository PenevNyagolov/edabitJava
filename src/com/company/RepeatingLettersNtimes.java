//Repeating Letters N Times
//Create a function that repeats each character in a string n times.
//
//Examples
//repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
//
//repeat("hello", 3) ➞ "hhheeellllllooo"
//
//repeat("stop", 1) ➞ "stop"
package repeatinglettersntimes;

public class RepeatingLettersNtimes {

    public static void main(String[] args) {
        System.out.println(repeat("hello", 3));
    }

    public static String repeat(String str, int n) {
       String result = "";
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<n; j++){
				result += str.charAt(i);
			}
		}
		return result;
    }
}
