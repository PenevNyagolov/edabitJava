package com.company;

import java.util.Arrays;

public class rotateMaxNumber {
    public static void main(String[] args) {
        String num = "1217";
        String[] strings = num.split("");
        int[] ints = new int[strings.length];
        int temp = 0;
        for (int i=0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(ints));
                for (int i = ints.length; i >= 0; i--)
        {
            for (int j = i + 1; j < ints.length; j++)
            {
                if(ints[i] < ints[j])
                {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println(temp);
        //System.out.println(rotateMaxNumber("1217"));
    }
//    public static int rotateMaxNumber(String num) {
//
//        String[] strings = num.split("");
//        int[] ints = new int[strings.length];
//        int temp = 0;
//        for (int i=0; i < strings.length; i++) {
//            ints[i] = Integer.parseInt(strings[i]);
//        }
//        for (int i = 0; i < ints.length; i++)
//        {
//            for (int j = i + 1; j < ints.length; j++)
//            {
//                if(ints[i] < ints[j])
//                {
//                    temp = ints[i];
//                    ints[i] = ints[j];
//                    ints[j] = temp;
//                }
//            }
//        }
//        return temp;
//    }
}
//    String[] r=n.split("");
//		java.util.Arrays.sort(r, (a,b)->b.charAt(0)-a.charAt(0));
//                return Integer.parseInt(String.join("", r));