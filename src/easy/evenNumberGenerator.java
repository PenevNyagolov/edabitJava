package easy;

import java.util.Arrays;

public class evenNumberGenerator {
    public static void main(String[] args) {
        int[] a = new int[8 / 2];
        int j = 0;
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {

                a[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(findEvenNums(8));
    }
    public static int[] findEvenNums(int num) {
        int[] a = new int[num / 2];
        int j = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {

                a[j] = i;
                j++;
            }
        }
        return a;
    }
}

//    findEvenNums(8) ➞ [2, 4, 6, 8]
//
//        findEvenNums(4) ➞ [2, 4]
//
//        findEvenNums(2) ➞ [2]
