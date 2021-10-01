//Concatenate First and Last Name into One String
//Given two strings, firstName and lastName, return a single string in the format "last, first".
//
//Examples
//concatName("First", "Last") ➞ "Last, First"
//
//concatName("John", "Doe") ➞ "Doe, John"
//
//concatName("Mary", "Jane") ➞ "Jane, Mary"

package concatenatefirstlastnameonestring;

public class ConcatenateFirstLastNameOneString {

    public static void main(String[] args) {
     
        System.out.println(concatName("First", "Last"));
        
    }
    public static String concatName(String firstName, String lastName) {
		return lastName + ", " + firstName;
	}
}
