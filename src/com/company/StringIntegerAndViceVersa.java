//String to Integer and Vice Versa
//Write two functions:
//
//toInt() : A function to convert a string to an integer.
//toStr() : A function to convert an integer to a string.
//Examples
//toInt("77") ➞ 77
//
//toInt("532") ➞ 532
//
//toStr(77) ➞ "77"
//
//toStr(532) ➞ "532"

package stringintegerandviceversa;


public class StringIntegerAndViceVersa {

   
    public static void main(String[] args) {
        System.out.println(toInt("77"));
        System.out.println(toStr(77));
    }
    public static int toInt(String str) {
		int a = Integer.parseInt(str);
    return a;
	}
	
	public static String toStr(int num) {
		String b = String.valueOf(num);
		return b;
	}
}
