//Find the Perimeter of a Rectangle
//Create a function that takes height and width and finds the perimeter of a rectangle.
//
//Examples
//findPerimeter(6, 7) ➞ 26
//
//findPerimeter(20, 10) ➞ 60
//
//findPerimeter(2, 9) ➞ 22

package findperimeterrectangle;

/**
 *
 * @author tihomir
 */
public class FindPerimeterRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(findPerimeter(6,7));
    }
    public static int findPerimeter(int height, int width) {
		return (height * 2) + (width * 2);
  }
}
