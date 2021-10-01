//Check if an Array Contains a Given Number
//Write a function to check if an array contains a particular number.
//
//Examples
//check([1, 2, 3, 4, 5], 3) ➞ true
//
//check([1, 1, 2, 1, 1], 3) ➞ false
//
//check([5, 5, 5, 6], 5) ➞ true
//
//check([], 5) ➞ false
package checkarraycontainsgivennumber;

public class CheckArrayContainsGivenNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(check(arr, 3));
    }

    public static boolean check(int[] arr, int el) {
        for(int s: arr){
		if(s == el)
			return true;
	}
	return false;
    }
}
