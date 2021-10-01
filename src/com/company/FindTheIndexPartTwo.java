//Find the Index (Part 2)
//Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.
//
//Examples
//search([1, 2, 3, 4], 3) ➞ 2
//
//search([2, 4, 6, 8, 10], 8) ➞ 3
//
//search([1, 3, 5, 7, 9], 11) ➞ -1

package findtheindexparttwo;

public class FindTheIndexPartTwo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(search(arr,3));
    }
    public static int search(int arr[], int item) {
		for (int i = 0; i < arr.length; i++)
		if (arr[i] == item)
			return i;

	return -1;
	}
}
