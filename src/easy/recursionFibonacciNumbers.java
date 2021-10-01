package easy;

public class recursionFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fib(0));
    }
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}

//    fib(0) ➞ 0
//
//        fib(1) ➞ 1
//
//        fib(2) ➞ 1
//
//        fib(8) ➞ 21
