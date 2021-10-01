package com.company;

public class sumOfParallelCircuits {
    public static void main(String[] args) {
        int[] arr = {6,3,6};
        System.out.println(parallelResistance(arr));
    }
    public static double parallelResistance(int[] r) {
        double result=0;
        for(int i=0; i<r.length; i++){
            double n= r[i];
            result+= 1/n;
        }
        return 1/result;
    }
}
