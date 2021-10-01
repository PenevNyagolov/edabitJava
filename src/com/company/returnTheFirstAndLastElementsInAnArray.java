package opit;

import java.util.Arrays;

public class returnTheFirstAndLastElementsInAnArray {
    public static void main(String[] args) {

        String[] a = {"edabit", "13", "true"};
        System.out.println(Arrays.toString(firstLast(a)));
       // System.out.println(a[a.length - 1]);
    }
    public static String[] firstLast(String[] arr) {
       //return Arrays.toString(arr[0]);
        String[] fl;
        String a = arr[0];
        String b = arr[arr.length - 1];
        return fl = new String[]{a,b};
    }
}

//firstLast(["one", "two"]) ➞ ["one", "two"]
//firstLast(["edabit", "13", "true"]) ➞ ["edabit", "true"]
//firstLast(["zero"]) ➞ ["zero"]
