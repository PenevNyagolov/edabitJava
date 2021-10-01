package easy;

public class recursionArraySum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(sum(a));
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
//    sum([1, 2, 3, 4]) ➞ 10
//
//        sum([1, 2]) ➞ 3
//
//        sum([1]) ➞ 1
//
//        sum([]) ➞ 0