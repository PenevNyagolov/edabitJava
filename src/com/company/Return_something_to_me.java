//Return Something to Me!
//Write a function that returns the string "something" joined with a space " " and the given argument a.
//
//Examples
//giveMeSomething("is better than nothing") ➞ "something is better than nothing"
//
//giveMeSomething("Bob Jane") ➞ "something Bob Jane"
//
//giveMeSomething("something") ➞ "something something"
//Notes
//Assume an input is given.

package return_something_to_me;

public class Return_something_to_me {

    public static void main(String[] args) {
        System.out.println(giveMeSomething("Bob Jane"));
    }
    
    public static String giveMeSomething(String a) {
        
	String b = "something";
		
		return b + " " + a;	
	}
}
