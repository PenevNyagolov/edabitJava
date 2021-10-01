package com.company;

import java.util.Arrays;

public class differenceOfMaxAndMin {
    public static void main(String[] args) {

        int[] arr = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(arr));
    }
    public static int differenceMaxMin(int[] arr) {

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length -1];
        return max - min;
    }
}
