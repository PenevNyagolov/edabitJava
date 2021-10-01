//Return the First Element of an Array
//Create a function that takes an array and returns the first element.
//
//Examples
//getFirstValue([1, 2, 3]) ➞ 1
//
//getFirstValue([80, 5, 100]) ➞ 80
//
//getFirstValue([-500, 0, 50]) ➞ -500
//Notes
//The first element in an array always has an index of 0.

package returnthefirstelementofanarray;

/**
 *
 * @author tihomir
 */
public class ReturnTheFirstElementOfAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr = {1,2,3};
       
        System.out.println(getFirstValue(arr));
    }
    public static int getFirstValue(int[] arr) {
		return arr[0];
	}
}
