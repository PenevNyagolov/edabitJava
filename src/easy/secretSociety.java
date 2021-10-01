package easy;

import java.util.Arrays;

public class secretSociety {
    public static void main(String[] args) {
        String[] a = {"Adam", "Sarah", "Malcolm"};
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            char[] b = a[i].toCharArray();
//            String str = String.valueOf(b[0]);
//            System.out.print(str);
//        }
        System.out.println(societyName(a));

    }
    public static String societyName(String[] friends) {
        char[] b = new char[friends.length];
        String c = "";
        Arrays.sort(friends);
        for (int i = 0; i < friends.length; i++) {
            b = friends[i].toCharArray();
            c += String.valueOf(b[0]);
//            c += friends[i].replaceAll("[a-z]","");
        }
        return c;
    }
}
//    societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"
//
//        societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"
//
//        societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMPRR"
