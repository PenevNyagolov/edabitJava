package easy;

import java.util.Arrays;

public class edabitExperiencePoints {
    public static void main(String[] args) {
        int[] a = {89, 77, 30, 4, 1};
        System.out.println(getXP(a));
    }
    public static String getXP(int[] c) {
     return String.valueOf((c[0] * 5) + (c[1] * 10) + (c[2] * 20) + (c[3] * 40) + (c[4] * 80)) + "XP";
    }
}

//    getXP([89, 77, 30, 4, 1]) ➞ "2055XP"
// Very Easy: 89 * 5 = 445
// Easy: 77 * 10 = 770
// Medium: 30 * 20 = 600
// Hard: 4 * 40 = 160
// Very Hard: 1 * 80 = 80
// 445 + 770 + 600 + 160 + 80 = 2055

//        getXP([254, 32, 65, 51, 34]) ➞ "7650XP"

//        getXP([11, 0, 2, 0, 27]) ➞ "2255XP"
