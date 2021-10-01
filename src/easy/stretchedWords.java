package easy;

import java.util.Arrays;

public class stretchedWords {
    public static void main(String[] args) {
        System.out.println(unstretch("ppoeemm"));
    }
    public static String unstretch(String word) {
        char[] a = word.toCharArray();
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {
                j++;
                a[j] = a[i];
            }
        }
        return String.valueOf(Arrays.copyOfRange(a, 0, j + 1));
    }
}

//    unstretch("ppoeemm") ➞ "poem"
//
//        unstretch("wiiiinnnnd") ➞ "wind"
//
//        unstretch("ttiiitllleeee") ➞ "title"
//
//        unstretch("cccccaaarrrbbonnnnn") ➞ "carbon"
