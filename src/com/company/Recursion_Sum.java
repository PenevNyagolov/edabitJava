//Recursion: Sum
//Write a function that recursively finds the sum of the first n natural numbers.
//
//Examples
//sum(5) ➞ 15
//// 1 + 2 + 3 + 4 + 5 = 15
//
//sum(1) ➞ 1
//
//sum(12) ➞ 78

package recursion_sum;

public class Recursion_Sum {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n) {
	 if (n >= 1) {
        return sum(n - 1) + n;
    }
    return n;	
	}
}
