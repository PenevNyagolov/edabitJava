package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumOFPolygon {
    public static void main(String[] args)  {
       System.out.println(sumOfAngles(3));
    }
    public static int sumOfAngles(int n) {
		return (n - 2) * 180;
	}
}
