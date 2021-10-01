//Minimum Removals to Make Sum Even
//Create a function that returns the minimum number of removals to make the sum of all elements in an array even.
//
//Examples
//minimumRemovals([1, 2, 3, 4, 5]) ➞ 1
//
//minimumRemovals([5, 7, 9, 11]) ➞ 0
//
//minimumRemovals([5, 7, 9, 12]) ➞ 1
//Notes
//If the sum is already even, return 0 (see example #2).
//The output will be either 0 or 1.

package minimumremovalstomakesumeven;

public class MinimumRemovalsToMakeSumEven {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println(minimumRemovals(arr));
    }
    public static int minimumRemovals(int[] arr) {
		  int count = 0; 
      
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] % 2 == 1) 
                count++; 
            if (count % 2 == 0) 
                return 0; 
             else
                return 1;  
	}
}
