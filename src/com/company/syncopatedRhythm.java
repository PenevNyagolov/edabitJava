package com.company;

public class syncopatedRhythm {
    public static void main(String[] args) {

        System.out.println(hasSyncopation(".#.#.#.#"));
    }
    public static boolean hasSyncopation(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1 && s.charAt(i) == '#') {
                return true;
            }
        }
        return false;
    }
}
