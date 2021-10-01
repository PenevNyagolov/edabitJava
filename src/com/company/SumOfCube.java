//Sum of Cubes
//Create a function that takes in an array of numbers and returns the sum of its cubes.
//
//Examples
//sumOfCubes([1, 5, 9]) ➞ 855
//// Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855
//
//sumOfCubes([3, 4, 5]) ➞ 216
//
//sumOfCubes([2]) ➞ 8
//
//sumOfCubes([]) ➞ 0
//Notes
//If given an empty array, return 0.

package sumofcube;

public class SumOfCube {

    public static void main(String[] args) {
        int[] nums = {3,4,5};
                System.out.println(sumOfCubes(nums));
    }
    public static int sumOfCubes(int[] nums) {
	 int sum = 0; 
        for (int x = 0; x < nums.length; x++) 
            sum += Math.pow(nums[x], 3); 
            //sum += nums[x];// * nums[x] * nums[x];
        return sum; 	
	}
}
