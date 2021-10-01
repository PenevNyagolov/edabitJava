package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class inchesToFeet {
    public static void main(String[] args)  {
       System.out.println(convert(33));
    }
    public static int convert(int inches) {
		return inches / 12;
	}
}
