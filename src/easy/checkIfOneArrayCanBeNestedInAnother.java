package easy;

import java.util.Arrays;

public class checkIfOneArrayCanBeNestedInAnother {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {0,6};
        System.out.println(canNest(a,b));
    }
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1]){
             return true;
        }else {
            return false;
        }
    }
}


//    canNest([1, 2, 3, 4], [0, 6]) ➞ true
//
//        canNest([3, 1], [4, 0]) ➞ true
//
//        canNest([9, 9, 8], [8, 9]) ➞ false
//
//        canNest([1, 2, 3, 4], [2, 3]) ➞ false