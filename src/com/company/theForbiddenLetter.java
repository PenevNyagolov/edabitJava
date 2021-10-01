package com.company;

public class theForbiddenLetter {
    public static void main(String[] args) {
        String[] a = {"rock", "paper", "scissors"};
        System.out.println(forbiddenLetter("r",a));
    }
    public static boolean forbiddenLetter(String ch, String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] a = words[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                char b = ch.charAt(0);
                if (b == a[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

//    forbiddenLetter("m", ["deep", "loves", "tesh"]) ➞ true
//
//        forbiddenLetter("r", ["rock", "paper", "scissors"]) ➞ false
//
//        forbiddenLetter("a", ["spoon", "fork", "knife"]) ➞ true
//
//        forbiddenLetter("m", []) ➞ true
