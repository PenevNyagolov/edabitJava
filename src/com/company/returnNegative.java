package com.company;

public class returnNegative {
    public static void main(String[] args) {

        System.out.println(returnNegative(-4));
    }
    public static int returnNegative(int n) {

        if (n > 0){
            return n * -1;
        }else {
            return n * 1;
        }
    }
}
