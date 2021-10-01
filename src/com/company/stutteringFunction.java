package com.company;

public class stutteringFunction {
    public static void main(String[] args) {

        String a = "incredible";
        String c = a.substring(0,2);
        String b = "...";
        System.out.println(c.concat(b) + a.substring(2));
        System.out.println(stutter("incredible"));
    }
    public static String stutter(String word) {
        String c = word.substring(0,2);
        String b = "...";
        return c.concat(b) + " " + c.concat(b) + " " + word + "?";
    }
}
