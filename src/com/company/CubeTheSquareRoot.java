//Cube the Square Root
//Create a function that takes a number as an argument and returns the square root of that number cubed.
//
//Examples
//cubeSquareRoot (81) ➞ 729
//
//cubeSquareRoot (1646089) ➞ 2111932187
//
//cubeSquareRoot (695556) ➞ 580093704

package cubethesquareroot;

public class CubeTheSquareRoot {

    public static void main(String[] args) {
        System.out.println(cubeSquareRoot(729));
    }
    public static int cubeSquareRoot(int num) {
      return (int) Math.sqrt(Math.pow(num, 3));
       	
  }
}
