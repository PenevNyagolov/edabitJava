package com.company;

public class fizzBuzzInterview {
    public static void main(String[] args) {

        System.out.println(5 % 5);
        System.out.println(fizzBuzz(15));
    }
    public static String fizzBuzz(int n) {

        String a = "Fizz";
        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz";
        }else if (n % 3 == 0){
            return "Fizz";
        }else if (n % 5 == 0) {
            return "Buzz";
        }else {
            return String.valueOf(n);
        }
        //return a;
    }
}
