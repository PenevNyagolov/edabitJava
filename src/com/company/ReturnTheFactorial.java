//Return the Factorial
//Create a function that takes an integer and returns the factorial of that integer. That is, the integer multiplied by all positive lower integers.
//
//Examples
//factorial(3) ➞ 6
//
//factorial(5) ➞ 120
//
//factorial(13) ➞ 6227020800
package returnthefactorial;

public class ReturnTheFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(11));
    }

    public static int factorial(int num) {
        if (num <= 2) {
            return num;
        }
        return num * factorial(num - 1);
    }
}

//               int sum = 1;
//		for (int i = 1; i <= num; i++)
//			sum *= i;
//		
//		return sum;
	////////////////
