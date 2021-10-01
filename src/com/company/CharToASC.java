
//Create a function that returns the ASCII value of the passed in character.
//
//Examples
//ctoa('A') ➞ 65
//
//ctoa('m') ➞ 109
//
//ctoa('[') ➞ 91
//
//ctoa('\') ➞ 92
//Notes
//Don't forget to return the result.

package chartoasc;

public class CharToASC {

    public static void main(String[] args) {
        System.out.println(ctoa('m'));
    }
    public static int ctoa(char c) {
		return (int)c;
	}
}
