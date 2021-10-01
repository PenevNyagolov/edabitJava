package com.company;

public class happyBirthday {
    public static void main(String[] args) {
        int c = (65 / 21);
        double b = c % 2;
        System.out.println(c);
        System.out.println(happyBirthday(65));
    }
    public static String happyBirthday(int age) {

        double a = age % 10;
        if (a % 2 == 0){
            double b = (age / 20.0) * 10;
            return "Tesha is just 20, in base " + (int)b + "!";
        }else {
            double b = (age / 20.0) * 10;
            return "Tesha is just 21, in base " + (int)b + "!";
        }
    }
}

//    happyBirthday(54) ➞ "Tesha is just 20, in base 27!"
//
//        happyBirthday(46) ➞ "Tesha is just 20, in base 23!"
//
//        happyBirthday(65) ➞ "Tesha is just 21, in base 32!"
//
//        happyBirthday(83) ➞ "Tesha is just 21, in base 41!"
//
//        happyBirthday(66) ➞ "Tesha is just 20, in base 33!"
//
//        happyBirthday(22) ➞ "Tesha is just 20, in base 11!"
