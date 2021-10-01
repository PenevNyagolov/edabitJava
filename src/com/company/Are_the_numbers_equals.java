//Are the Numbers Equal?
//Create a function that returns true when x is equal to y; otherwise return false.
//
//Examples
//isSameNum(4, 8) ➞ false
//
//isSameNum(2, 2) ➞  true
//
//isSameNum(42, 32) ➞  false

package are_the_numbers_equals;

public class Are_the_numbers_equals {

    public static void main(String[] args) {
       System.out.println(isSameNum(3,9));
    }
    
	public static boolean isSameNum(int x, int y) {
	  Integer a = new Integer(x);
		Integer b = new Integer(y);
		//boolean a = x.equals(y);
		return a.equals(b);
	}
}
    