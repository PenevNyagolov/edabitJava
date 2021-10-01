public class findTheLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 1, 3};
        System.out.println(findLargestNum(a));
    }
   public static int findLargestNum(int[] nums) {
		int max = nums[0];
      for(int i = 0;i < nums.length;i++){
         if(max < nums[i]){
         max = nums[i];
         }
      }
      return max;
     // Arrays.sort(nums);
		//	return nums[nums.length - 1];
	} 
}

//findLargestNum([4, 5, 1, 3]) ➞ 5
//findLargestNum([300, 200, 600, 150]) ➞ 600
//findLargestNum([1000, 1001, 857, 1]) ➞ 1001

