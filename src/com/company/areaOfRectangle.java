package com.company;

public class areaOfRectangle {
    public static void main(String[] args) {

        System.out.println(getArea(0,4));
    }
    public static int getArea(int h, int w) {

        if (h <= 0 || w <= 0){
            return -1;
        }else {
            return h * w;
        }
        //return (h < 0) ? -1 : h * w;
    }
}
