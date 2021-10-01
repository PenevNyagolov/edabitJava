package com.company;

import java.util.Arrays;

public class sortNumbersInAscendingOrder {
    public static void main(String[] args) {

        int[] arr = {1, 2, 10, 50, 5};
        System.out.println(sortNumsAscending(arr));
    }
    public static int[] sortNumsAscending(int[] nums) {

        Arrays.sort(nums);
        return nums;
    }
}
