package easy;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr) {
        int[] output = arr.clone();
        for (int i = arr.length - 1; i > -1; i--) {
            output[i] = arr[arr.length - i - 1];
        }
        return output;
    }
}

//    reverse([1, 2, 3, 4]) ➞ [4, 3, 2, 1]
//
//        reverse([9, 9, 2, 3, 4]) ➞ [4, 3, 2, 9, 9]
//
//        reverse([]) ➞ []
