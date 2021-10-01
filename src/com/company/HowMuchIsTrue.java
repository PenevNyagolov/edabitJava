//How Much is True?
//Create a function which returns the number of true values there are in an array.
//
//Examples
//countTrue([true, false, false, true, false]) ➞ 2
//
//countTrue([false, false, false, false]) ➞ 0
//
//countTrue([]) ➞ 0
//Notes
//Return 0 if given an empty array.
//All array items are of the type bool (true or false).
package howmuchistrue;

import java.util.stream.IntStream;

public class HowMuchIsTrue {

    public static void main(String[] args) {
        boolean[] arr = {true, false, false, true, false};
        System.out.println(countTrue(arr));
    }

    public static int countTrue(boolean[] arr) {
        boolean a = true;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                b++;
            }
        }
        return b;
    }
}
///////////
//int count = 0;
//    for (boolean b : arr) {
//      if (b == true) {
//        count++;
//      }
//    }
//    return count;