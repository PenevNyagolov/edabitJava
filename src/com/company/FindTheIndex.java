//Find the Index (Part 1)
//Create a function that finds the index of a given item.
//
//Examples
//search([1, 5, 3], 5) ➞ 1
//
//search([9, 8, 3], 3) ➞ 2
//
//search([1, 2, 3], 4) ➞ -1
package findtheindex;

public class FindTheIndex {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int item = 5;

        System.out.println(search(arr, item));
    }

    public static int search(int[] arr, int item) {
for (int i = 0; i < arr.length; i++)
		if (arr[i] == item)
			return i;

	return -1;
    }
}
