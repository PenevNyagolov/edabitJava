package opit;

import java.util.Arrays;

public class getTheSumOfAllArrayElement {
    public static void main(String[] args) {

        int[] arrSum = {2,7,4};
        System.out.println(arraySum(arrSum));
    }
    public static int arraySum(int[] arr){
        //return Arrays.stream(arr).sum();
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
//        sum([2, 7, 4]) ➞ 13
//         sum([45, 3, 0]) ➞ 48
//        sum([-2, 84, 23]) ➞ 105