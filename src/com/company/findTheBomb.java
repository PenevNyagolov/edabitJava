package com.company;

public class findTheBomb {
    public static void main(String[] args) {
//        String b = "There is a bOmB.";
//        String c = b.toLowerCase().trim();
//        System.out.println(c);
        System.out.println(bomb("There is a bOmB."));
    }
    public static String bomb(String str) {

        String a = str.toLowerCase().trim();
        if (a.contains("bomb")){
            return "DUCK!";
        }else {
            return "Relax, there's no bomb.";
        }
    }
}
