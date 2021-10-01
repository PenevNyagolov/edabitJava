package opit;

import java.util.Arrays;

public class maximumDifference {
    public static void main(String[] args) {
int[] num = {10, 15, 20, 2, 10, 6};
        System.out.println(difference(num));
    }
    public static int difference(int[] nums) {

       Arrays.sort(nums);
       int min = nums[0];
       int max = nums[nums.length - 1];
       return max - min;
    }
}

//    difference([10, 15, 20, 2, 10, 6]) ➞ 18
//        # 20 - 2 = 18
//        difference([-3, 4, -9, -1, -2, 15]) ➞ 24
//        # 15 - (-9) = 24
//        difference([4, 17, 12, 2, 10, 2]) ➞ 15
