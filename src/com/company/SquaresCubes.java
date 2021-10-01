//Squares and Cubes
//Create a function that takes an array of two numbers and checks if the square root of the first number is equal to the cube root of the second number.
//
//Examples
//checkSquareAndCube([4, 8]) ➞ true
//
//checkSquareAndCube([16, 48]) ➞ false
//
//checkSquareAndCube([9, 27]) ➞ true
//Notes
//Remember to return either true or false.
//All arrays contain two positive numbers.
package squarescubes;

public class SquaresCubes {

    public static void main(String[] args) {
        int[] arr = {25, 126};
        System.out.println(squaresAndCubes(arr));
    }

    public static boolean squaresAndCubes(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            a = (int) Math.sqrt(arr[0]);
            b = (int) Math.cbrt(arr[1]);

        }
        if(a != b){
            return false;
        }
        return true;
    }
}
