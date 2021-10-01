package com.company;

public class twoMakesTen {
    public static void main(String[] args) {

        System.out.println(makesTen(9,9));
    }
    public static boolean makesTen(int a, int b) {

        if (a == 10 || b == 10 || a + b == 10){
            return true;
        }else {
            return false;
        }
    }
}
