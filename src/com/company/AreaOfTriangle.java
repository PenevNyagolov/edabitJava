//Area of a Triangle
//Write a function that takes the base and height of a triangle and return its area.
//
//Examples
//triArea(3, 2) ➞ 3
//
//triArea(7, 4) ➞ 14
//
//triArea(10, 10) ➞ 50
//Notes
//The area of a triangle is: (base * height) / 2

package areaoftriangle;

/**
 *
 * @author tihomir
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(triArea(3,2));
    }
    public static int triArea(int base, int height) {
		return (base * height) / 2;
	}
}
