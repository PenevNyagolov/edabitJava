//Football Points
//Create a function that takes the number of wins, draws and losses and calculates the number of points a 
//football team has obtained so far.
//
//wins get 3 points
//draws get 1 point
//losses get 0 points
//Examples
//footballPoints(3, 4, 2) ➞ 13
//
//footballPoints(5, 0, 2) ➞ 15
//
//footballPoints(0, 0, 1) ➞ 0
//Notes
//Inputs will be numbers greater than or equal to 0.

package football_points;


public class Football_points {

   
    public static void main(String[] args) {
      
        System.out.println(footballPoints(3,4,2));
        
    }
    public static int footballPoints(int wins, int draws, int loses) {
        
		int a = wins * 3;
		int b = draws * 1;
		int c = loses * 0;
		
		return a + b + c;
  }
}
