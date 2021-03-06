//Equality Check
//In this challenge, you must verify the equality of two different given parameters: a and b.
//
//Both the value and the type of parameters need to be tested in order to have a matching equality. The possible types of the given parameters are:
//
//Numbers
//Strings
//Booleans (false or true)
//Special values: null
//What have you learned so far that will permit you to do two different checks (value and type) with a single statement?
//
//Implement a function that returns true if the parameters are equal, and false if they are different.
//
//Examples
//checkEquality(1, true) ➞ false
//// A number and a boolean: their type is different
//
//checkEquality(0, "0") ➞ false
//// A number and a string: their type is different
//
//checkEquality(1,  1) ➞ true
//// A number and a number: their type and value are equal
package equalitycheck;

public class EqualityCheck {

    public static void main(String[] args) {
        System.out.println(checkEquality(null, false));
    }

    public static boolean checkEquality(Object a, Object b) {
        if(a != null && a.equals(b)) {
            return true;
        }else{
            return false;
        }
    }
}
