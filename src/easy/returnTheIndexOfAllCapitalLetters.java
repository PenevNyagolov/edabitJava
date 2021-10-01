package easy;

import java.util.Arrays;

public class returnTheIndexOfAllCapitalLetters {
    public static void main(String[] args) {
//        String a = "eDaBiT";
//        char[] b = a.toCharArray();
//        for (int i = 0; i < b.length ; i++) {
//            if (Character.isUpperCase(b[i])){
//                System.out.println(i);
//            }
//        }
        System.out.println(Arrays.toString(indexOfCaps("eDaBiT")));
    }
    public static int[] indexOfCaps(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                //res[j] = i;
                count++;
            }
        }
        int[] res = new int[count];
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                res[j] = i;
                j++;
            }
        }
        return res;
    }
}

//    indexOfCaps("eDaBiT") ➞ [1, 3, 5]
//
//        indexOfCaps("eQuINoX") ➞ [1, 3, 4, 6]
//
//        indexOfCaps("determine") ➞ []
//
//        indexOfCaps("STRIKE") ➞ [0, 1, 2, 3, 4, 5]
//
//        indexOfCaps("sUn") ➞ [1]
//return IntStream.range(0, s.length())
//        .filter(i -> Character.isUpperCase(s.charAt(i)))
//        .toArray();