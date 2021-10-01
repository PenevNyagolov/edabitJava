package easy;

import java.util.Arrays;

public class capitaliseTheNames {
    public static void main(String[] args) {
        String[] a = {"mavis", "senaida", "letty"};
        System.out.println(Arrays.toString(capMe(a)));
    }
    public static String[] capMe(String[] s) {
        String[] b = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            //String name  = "stackoverflow";
            b[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase();
        }
        return b;
    }
}

//    capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
//
//        capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
//
//        capMe(["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]

