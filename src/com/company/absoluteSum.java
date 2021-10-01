public class absoluteSum {
    public static void main(String[] args) {
        int[] a = {-3, -4, -10, -2, -3};
        System.out.println(getAbsSum(a));
    }
 	public static int getAbsSum(int[] nums) {
      
      int sum = 0;
		for(int i = 0;i < nums.length;i++){
          sum += Math.abs(nums[i]);
      }
      return sum;
	}
}


//getAbsSum([2, -1, 4, 8, 10]) ➞ 25
//getAbsSum([-3, -4, -10, -2, -3]) ➞ 22
//getAbsSum([2, 4, 6, 8, 10]) ➞ 30
//getAbsSum([-1]) ➞ 1