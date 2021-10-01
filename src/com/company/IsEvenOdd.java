//Is the Number Even or Odd?
//Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.
//
//Examples
//isEvenOrOdd(3) ➞ "odd"
//
//isEvenOrOdd(146) ➞ "even"
//
//isEvenOrOdd(19) ➞ "odd"
package isevenodd;

public class IsEvenOdd {

    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(147));
    }

    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
