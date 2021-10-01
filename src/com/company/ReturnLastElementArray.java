//Return the Last Element in an Array
//Create a method that accepts an array and returns the last item in the array.
//
//Examples
//getLastItem([1, 2, 3]) ➞ 3
//
//getLastItem([0]) ➞ 0
//
//getLastItem([-1, -3]) ➞ -3

package returnlastelementarray;

public class ReturnLastElementArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(getLastItem(nums));
    }
     public static int getLastItem(int[] nums) {
      return nums[nums.length - 1];
    }
}
