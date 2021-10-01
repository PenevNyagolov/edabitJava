//Maximum Edge of a Triangle
//Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
//
//Examples
//nextEdge(8, 10) ➞ 17
//
//nextEdge(5, 7) ➞ 11
//
//nextEdge(9, 2) ➞ 10
//Notes
//(side1 + side2) - 1 = maximum range of third edge.
//The side lengths of the triangle are positive integers.

package maximumedgeoftriangle;

/**
 *
 * @author tihomir
 */
public class MaximumEdgeOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nextEdge(9,2));
    }
    public static int nextEdge(int side1, int side2) {
	return (side1 + side2) - 1;	
  }
}
