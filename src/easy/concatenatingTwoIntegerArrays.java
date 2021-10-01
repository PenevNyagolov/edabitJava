package easy;

import java.util.Arrays;

public class concatenatingTwoIntegerArrays {
    public static void main(String[] args) {
          int[] arr1 = {1, 3, 5};
          int[] arr2 = {2, 6, 8};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }
    public static int[] concat(int[] arr1, int[] arr2) {
    int[]c = new int[arr1.length+arr2.length];
    int count = 0;

      for(int i = 0; i < arr1.length; i++) {
        c[i] = arr1[i];
        count++;
        }
        for(int j = 0; j < arr2.length;j++) {
        c[count++] = arr2[j];
        }
        return c;
    }
}

//    concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]
//
//        concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]
//
//        concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞ [4, 5, 1, 3, 3, 3, 3, 3]
//int[]a = {1,2,3,4};
//    int[]b = {4,16,1,2,3,22};
//    int[]c = new int[a.length+b.length];
//    int count = 0;
//
//      for(int i = 0; i < a.length; i++) {
//        c[i] = a[i];
//        count++;
//        }
//        for(int j = 0; j < b.length;j++) {
//        c[count++] = b[j];
//        }
//        for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");