package easy;

import java.util.Arrays;

public class incrementToTop {
    public static void main(String[] args) {
        int[] a = {3,3,3};
        System.out.println(incrementToTop(a));
    }
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int steps = 0;
        for (int i = 0; i < arr.length; i ++) {
            steps += max - arr[i];
        }
        return steps;
    }
}

//    incrementToTop([3, 3, 3]) ➞ 0
//
//        incrementToTop([3, 10, 3]) ➞ 14
