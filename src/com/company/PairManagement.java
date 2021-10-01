package opit;

public class PairManagement {

	public static void main(String[] args) {
		
		System.out.println(makePair(5, 9));

	}

	public static int[] makePair(int a, int b) {
//		makePair(1, 2) ➞ [1, 2]
//        makePair(51, 21) ➞ [51, 21]
//        makePair(512124, 215) ➞ [512124, 215]
		return new int[] {a, b};
	}
}
