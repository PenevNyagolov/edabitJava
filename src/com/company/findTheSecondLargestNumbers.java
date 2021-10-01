package com.company;

import java.util.Arrays;

public class findTheSecondLargestNumbers {
    public static void main(String[] args) {

        int[] arr = {10, 40, 30, 20, 50};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] num) {

        Arrays.sort(num);
        return num[num.length - 2];
    }
}
