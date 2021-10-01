//Add a Consecutive List of Numbers
//Write a function that takes the last number of a consecutive list of numbers and returns the total of all numbers up to and including it.
//
//Examples
//addUpTo(3) ➞ 6
//// 1 + 2 + 3 = 6
//
//addUpTo(10) ➞ 55
//// 1 + 2 + 3 + ... + 10 = 55
//
//addUpTo(7) ➞ 28
//// 1 + 2 + 3 + ... + 7 = 28
package addconsecutivelistnumber;

public class AddConsecutiveListNumber {

    public static void main(String[] args) {
        System.out.println(addUpTo(9));
    }

    public static int addUpTo(int n) {
        return n * (n + 1) / 2;
    }
}
