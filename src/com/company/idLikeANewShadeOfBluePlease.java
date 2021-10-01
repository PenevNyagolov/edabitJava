package com.company;

public class idLikeANewShadeOfBluePlease {
    public static void main(String[] args) {
        System.out.println(howManyWalls(46,5,4));
    }
    public static int howManyWalls(int n, int w, int h) {
           int a = w * h;
           int b = n / a;
           return b;
    }
}

//    howManyWalls(54, 1, 43) ➞ 1
//
//        howManyWalls(46, 5, 4) ➞ 2
//
//        howManyWalls(100, 4, 5) ➞ 5
//
//        howManyWalls(10, 15, 12) ➞ 0
//
//        howManyWalls(41, 3, 6) ➞ 2

