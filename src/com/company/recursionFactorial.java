package opit;

public class recursionFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }else{
            return factorial(n - 1) * n;
        }
    }
}

//factorial(5) ➞ 120
//factorial(3) ➞ 6
//factorial(1) ➞ 1
//factorial(0) ➞ 1
