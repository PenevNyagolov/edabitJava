package easy;

import java.util.Arrays;

public class filterByDigitLength {
    public static void main(String[] args) {
        int[] numbers = {12, 2000, 13, 1979, 12, 17};
        System.out.println(Arrays.toString(filterByLength(numbers,2)));
    }
    public static int[] filterByLength(int[] numbers, int length) {
        return Arrays.stream(numbers)
                .filter(x -> String.valueOf(x).length() == length)
                .toArray();
    }
}

//    filterByLength([12, 2000, 13, 1979, 12, 17], 2)  ➞ [12, 13, 12, 17]
// An array of only the numbers with 2 digits.

//        filterByLength([88, 232, 4, 9721, 555], 3) ➞ [232, 555]
// An array of only the numbers with 3 digits.

//        filterByLength([2, 7, 8, 9, 1012], 1) ➞ [2, 7, 8, 9]
// An array of only the numbers with a single digit.

//        filterByLength([32, 88, 74, 91, 300, 4050], 1) ➞ []
// No numbers with only 1 digit exist, thus, an empty array.

//        filterByLength([5, 6, 8, 9], 1) ➞ [5, 6, 8, 9]
// All numbers in the array have 1 digit only, thus, the original array.
