//Additive Inverse
//A number added with its additive inverse equals zero. Create a function that returns an array of additive inverses.
//
//Examples
//additiveInverse([5, -7, 8, 3]) ➞ [-5, 7, -8, -3]
//
//additiveInverse([1, 1, 1, 1, 1]) ➞ [-1, -1, -1, -1, -1]
//
//additiveInverse([-5, -25, 35]) ➞ [5, 25, -35]

package additiveinverse;

public class AdditiveInverse {

    public static void main(String[] args) {
        int[] arr3 = {5, -7, 8, 3};
        System.out.println(additiveInverse(arr3));
    }
    public static int[] additiveInverse(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			int num = 0 - arr[i];
			arr2[i] = num;
		}
		return arr2;
	}
}
