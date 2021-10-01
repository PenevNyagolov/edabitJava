package easy;

import java.util.Arrays;

public class cumulativeArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 3, -2, 408, 3, 3};
        System.out.println(Arrays.toString(cumulativeSum(arr)));
    }
    public static int[] cumulativeSum(int[] nums) {
        int[] out = new int[nums.length];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            out[i] = total;
        }
        return out;
    }
}

//    cumulativeSum([1, 2, 3]) ➞ [1, 3, 6]
//
//        cumulativeSum([1, -2, 3]) ➞ [1, -1, 2]
//
//        cumulativeSum([3, 3, -2, 408, 3, 3]) ➞ [3, 6, 4, 412, 415, 418]
