//Index Multiplier
//Return the sum of all items in an array, where each item is multiplied by its index (zero-based). For empty arrays, return 0.
//
//Examples
//indexMultiplier([1, 2, 3, 4, 5]) ➞ 40
//// (1*0 + 2*1 + 3*2 + 4*3 + 5*4)
//
//indexMultiplier([-3, 0, 8, -6]) ➞ -2
//// (-3*0 + 0*1 + 8*2 + -6*3)
package indexmultiplier;

public class IndexMultiplier {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(indexMultiplier(arr));

    }

    public static int indexMultiplier(int[] arr) {

        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            a += i * arr[i];
            // return arr[i];
            //return a;
            // a = arr[i];
        }
        return a;
    }
}
