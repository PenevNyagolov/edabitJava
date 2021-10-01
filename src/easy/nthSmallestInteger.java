package easy;

import java.util.Arrays;

public class nthSmallestInteger {
    public static void main(String[] args) {
        int[] a = {4,5};
        System.out.println(nthSmallest(a,2));
    }
    public static int nthSmallest(int[] arr, int n) {
        Arrays.sort(arr);
             if (n > arr.length){
                 return -1;
             }else {
                 int a = 0;
                 for (int i = 1; i <= arr.length; i++) {
                     if (i == n) {
                         a = arr[i - 1];
                     }
                 }
                 return a;
             }
    }
}

//    nthSmallest([1, 3, 5, 7], 1) ➞ 1
//
//        nthSmallest([1, 3, 5, 7], 3) ➞ 5
//
//        nthSmallest([1, 3, 5, 7], 5) ➞ -1
//
//        nthSmallest([7, 3, 5, 1], 2) ➞ 3
