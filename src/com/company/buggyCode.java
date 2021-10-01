package com.company;

import java.util.ArrayList;
import java.util.List;

public class buggyCode {
    public static void main(String[] args) {

        System.out.println(PrintArray(3));
    }
    public static List PrintArray(int number)
    {
        List array = new ArrayList<>();

        for(int count = 1; count <= number;count++)
        {
            array.add(count);
        }

        return array;
    }
}
