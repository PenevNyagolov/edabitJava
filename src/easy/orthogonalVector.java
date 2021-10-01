package easy;

public class orthogonalVector {
    public static void main(String[] args) {
        int[] a = {3,-1};
        int[] b = {7,5};
        System.out.println(isOrthogonal(a,b));
    }
    public static boolean isOrthogonal(int[] arr1, int[] arr2) {
        int n = arr1.length;

        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += arr1[i] * arr2[i];
        }
        if (sum == 0){
            return true;
        }else {
            return false;
        }
    }
}

//    isOrthogonal([1, 2], [2, -1]) ➞ true
//
//        isOrthogonal([3, -1], [7, 5]) ➞ false
//
//        isOrthogonal([1, 2, 0], [2, -1, 10]) ➞ true

