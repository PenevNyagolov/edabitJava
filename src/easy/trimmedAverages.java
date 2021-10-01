package easy;

import java.util.stream.IntStream;

public class trimmedAverages {
    public static void main(String[] args) {
        int[] a = {4, 5, 7, 100};
        System.out.println(trimmedAverages(a));
    }
    public static int trimmedAverages(int[] arr) {
        return (int)Math.round(IntStream.of(arr).boxed().sorted().skip(1)
                .limit(arr.length-2).reduce(Integer::sum).get()/(arr.length - 2d));

    }
}

//    trimmedAverages([4, 5, 7, 100]) ➞ 6
// Average of 5 and 7
//        trimmedAverages([10, 25, 5, 15, 20]) ➞ 15
// Average of 10, 15 and 20
//        trimmedAverages([1, 1, 1]) ➞ 1
//        trimmedAverages([5, 4, 54, 4, 6, 46, 56]) ➞ 23
