package opit;

public class algorithmsIntroductionToRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num) {
        if (num <= 1) // base case
            return 1;
        else
            return num*factorial(num-1);
    }
}

//factorial(5) ➞ 120
//factorial(3) ➞ 6
//factorial(2) ➞ 2
