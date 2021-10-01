package com.company;

import java.util.Arrays;

public class addingParityBits {
    public static void main(String[] args) {

        System.out.println(addParityBit("1011011"));
    }
    public static String addParityBit(String bits) {
        String[] arr = bits.split("");
        int sum = 0;
        for (String element : arr) {
            sum += Integer.parseInt(element);
        }
        if (sum % 2 == 0) {
            return bits + "0";
        }else {
            return bits + "1";
        }
    }
}
