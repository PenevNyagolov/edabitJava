package easy;

public class theFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }
    public static int Fibonacci(int a) {
        int num1 = 1, num2 = 1;
        //System.out.print("Fibonacci Series of "+count+" numbers:");
         int sumOfPrevTwo = 0;
        for (int i = 1; i < a; ++i)
        {
           // System.out.print(num1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return num2;
    }
}

//    Fibonacci(3) ➞ 3
//
//        Fibonacci(7) ➞ 21
//
//        Fibonacci(12) ➞ 233
