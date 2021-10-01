package opit;

import java.util.Arrays;

public class oddUpEvenDown {
    public static void main(String[] args) {

        int[] a = {3, 3, 4, 3};
        System.out.println(Arrays.toString(transform(a)));
    }
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]--;
            } else {
                arr[i]++;
            }
        }
        return arr;
    }
}

//transform([1, 2, 3, 4, 5]) ➞ [2, 1, 4, 3, 6]
//transform([3, 3, 4, 3]) ➞ [4, 4, 3, 4]
//transform([2, 2, 0, 8, 10]) ➞ [1, 1, -1, 7, 9]
