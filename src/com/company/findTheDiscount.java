package com.company;

public class findTheDiscount {
    public static void main(String[] args) {

        double finalPrice = (89.0 * 20.0) / 100;
        System.out.println(finalPrice);
        System.out.println(discount(89,20));
    }
    public static double discount(int price, int percentage) {

        double price1 = (Double.valueOf(price) * Double.valueOf(percentage)) / 100;
        return price - price1;
    }
}
