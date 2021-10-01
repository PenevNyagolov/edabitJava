package com.company;

public class oppositeHouse {
    public static void main(String[] args) {
        System.out.println(oppositeHouse(2,3));
    }
    public static long oppositeHouse(long house, long n) {
        return 2*n-house+1;
    }
}

//    oppositeHouse(1, 3) ➞ 6
//
//        oppositeHouse(2, 3) ➞ 5
//
//        oppositeHouse(3, 5) ➞ 8
//
//        oppositeHouse(5, 46) ➞ 88
