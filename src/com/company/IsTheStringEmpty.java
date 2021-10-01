//Is the String Empty?
//Create a function that returns true if a string is empty and false otherwise.
//
//Examples
//isEmpty("") ➞ true
//
//isEmpty(" ") ➞ false
//
//isEmpty("a") ➞ false
//Notes
//A string containing only whitespaces " " does not count as empty.

package isthestringempty;

public class IsTheStringEmpty {

    public static void main(String[] args) {
        System.out.println(isEmpty(" "));
    }
    	public static boolean isEmpty(String str) {
		if(str.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
