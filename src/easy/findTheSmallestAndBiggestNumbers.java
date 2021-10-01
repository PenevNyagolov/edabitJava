package easy;

import java.util.Arrays;

public class findTheSmallestAndBiggestNumbers {
    public static void main(String[] args) {
        double[] arr = {1, 23, 3, 45, 5,99};
        Arrays.sort(arr);
//        double[] a = new double[2];
        double b = arr[0];
        double c = arr[arr.length - 1];
        double[] a = {arr[0],arr[arr.length - 1]};
        System.out.println(b + " " + c);
        System.out.println(Arrays.toString(a));
        System.out.println(minMax(arr));
    }
    public static double[] minMax(double[] arr) {
        Arrays.sort(arr);
        double b = arr[0];
        double c = arr[arr.length - 1];
        double[] a = {arr[0],arr[arr.length - 1]};
        return a;
    }
}

//    minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
//
//        minMax([2334454, 5]) ➞ [5, 2334454]
//
//        minMax([1]) ➞ [1, 1]
