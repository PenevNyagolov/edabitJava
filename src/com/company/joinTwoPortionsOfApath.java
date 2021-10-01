package com.company;

public class joinTwoPortionsOfApath {
    public static void main(String[] args) {
        System.out.println(joinPath("portion1","portion2"));
    }
    public static String joinPath(String portion1, String portion2) {

        if (portion1.endsWith("/") || portion2.startsWith("/")){
            String a = portion1.replace("/","");
            String b = portion2.replace("/","");
            return a.concat("/").concat(b);
        }else {
            return portion1.concat("/").concat(portion2);
        }
    }
}
