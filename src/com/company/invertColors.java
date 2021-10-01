package com.company;

public class invertColors {
    public static void main(String[] args) {
        int[] a = {-3, -4, -10, -2, -3};
        System.out.println(getAbsSum(a));
    }
 	public static int[] getAbsSum(int[] rgb) {
		int[] ans = new int[]{255 - rgb[0], 255 - rgb[1], 255 - rgb[2] }; 
		return ans;
      //return IntStream.of(rgb).map(e -> 255-e).toArray();
	}
}


//invertColor([255, 255, 255]) ➞ [0, 0, 0]
// [255, 255, 255] is the color white.
// The opposite is [0, 0, 0], which is black.
//invertColor([12, 13, 200]) ➞ [243, 242, 55]
//invertColor([12, 17, 197]) ➞ [243, 238, 58]
//invertColor([243, 242, 235]) ➞ [12, 13, 20]
//invertColor([0, 0, 0]) ➞ [255, 255, 255]
//invertColor([165, 170, 221]) ➞ [90, 85, 34]
