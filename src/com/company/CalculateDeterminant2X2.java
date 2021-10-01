//Calculate Determinant of a 2x2 Matrix
//Create a function to calculate the determinant of a 2 x 2 matrix. The determinant of the following matrix is: ad - bc:
//
//[[a, b], [c, d]]
//Examples
//calcDeterminant([
//  [1, 2],
//  [3, 4]
//]) ➞ -2
//
//calcDeterminant([
//  [5, 3],
//  [3, 1]
//]) ➞ -4
//
//calcDeterminant([
//  [1, 1],
//  [1, 1]
//]) ➞ 0
package calculatedeterminant2x2;

public class CalculateDeterminant2X2 {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 3, 4 } };
        System.out.println(calcDeterminant(matrix));
    }

    public static int calcDeterminant(int[][] matrix) {
        
        int determinant = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        return determinant;
    }
}
