//Matchstick Houses
//This challenge will help you interpret mathematical relationships both algebraically and geometrically.
//
//Matchstick Houses, Steps 1, 2 and 3
//
//Create a function that takes a number (step) as an argument and returns the number of matchsticks in that step. See step 1, 2 and 3 in the image above.
//
//Examples
//matchHouses(1) ➞ 6
//
//matchHouses(4) ➞ 21
//
//matchHouses(87) ➞ 436
//Notes
//Step 0 returns 0 matchsticks.
package matchstichhouses;

public class MatchstichHouses {

    public static void main(String[] args) {
        System.out.println(matchHouses(87));
    }

    public static int matchHouses(int step) {
        if (step == 0) {
            return 0;
        } else {
            return (5 * step) + 1;
        }
    }
}
