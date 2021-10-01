//Reverse Coding Challenge #3
//This is a reverse coding challenge. Normally you're given explicit directions with how to create a function. Here, you must generate your own function to satisfy the relationship between the inputs and outputs.
//
//Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.
//
//Examples
//[5, 7, 8, 2, 1], 2 ➞ [1, 1, 0, 0, 1]
//
//[9, 8, 16, 47], 4 ➞ [1, 0, 0, 3]
//
//[17, 11, 99, 55, 23, 1], 5 ➞ [2, 1, 4, 0, 3, 1]
//
//[6, 1], 7 ➞ [6, 1]
//
//[3, 2, 9], 3 ➞ [0, 2, 0]
//
//[48, 22, 0, 19, 33, 100], 10 ➞ [8, 2, 0, 9, 3, 0]
//Notes
//If you get stuck, see Comments for a hint.
package revercecodingchalenge3;

import java.util.Arrays;

/**
 *
 * @author tihomir
 */
public class ReverceCodingChalenge3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] arr = {48,22,0,19,33,100};
        System.out.println(Arrays.toString(mysteryFunc(arr,10)));
    }

    public static int[] mysteryFunc(int[] arr, int num) {
        int[] c = new int[arr.length];
        
        for (int i = 0; i<arr.length; i++){
			int remainder = arr[i]%num;
			c[i] = remainder;
		}

        return c;
    }
}
//for (int i = 0; i < arr.length; i++) { arr[i] %= num; }
//		return arr;