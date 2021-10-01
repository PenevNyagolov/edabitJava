package easy;

import java.util.Arrays;

public class alphabetSoup {
    public static void main(String[] args) {
        System.out.println(AlphabetSoup("hello"));
    }
    public static String AlphabetSoup(String s) {
      char[] a = s.toCharArray();
      Arrays.sort(a);
      return new String(a);

    }
}

//    AlphabetSoup("hello") ➞ "ehllo"
//
//        AlphabetSoup("edabit") ➞ "abdeit"
//
//        AlphabetSoup("hacker") ➞ "acehkr"
//
//        AlphabetSoup("geek") ➞ "eegk"
//
//        AlphabetSoup("javascript") ➞ "aacijprstv"
