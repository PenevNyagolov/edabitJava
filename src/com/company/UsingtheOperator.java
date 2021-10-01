package opit;

public class UsingtheOperator {

	public static void main(String[] args) {
System.out.println(and(false, false));
	}

	public static boolean and(boolean a, boolean b) {

		if (a && b) {
			return true;
		} else {
			return false;
		}
//		and(true, false) ➞ false
//
//		and(true, true) ➞ true
//
//		and(false, true) ➞ false
//
//		and(false, false) ➞ false
	}
}
