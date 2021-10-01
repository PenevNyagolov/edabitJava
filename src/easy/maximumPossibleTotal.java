package easy;

import java.util.Arrays;

public class maximumPossibleTotal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxTotal(arr));
    }
    public static int maxTotal(int[] nums) {

        Arrays.sort(nums);
        int sum = 0;
        for (int i = 5; i < nums.length; i++) {
                sum += nums[i];
        }
        return sum;
    }
}

//    maxTotal([1, 1, 0, 1, 3, 10, 10, 10, 10, 1]) ➞ 43
//
//        maxTotal([0, 0, 0, 0, 0, 0, 0, 0, 0, 100]) ➞ 100
//
//        maxTotal([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 40