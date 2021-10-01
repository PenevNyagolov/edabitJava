//Add up the Numbers from a Single Number
//Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.
//
//Examples
//addUp(4) ➞ 10
//
//addUp(13) ➞ 91
//
//addUp(600) ➞ 180300
//Notes
//Expect any positive number between 1 and 1000.
package addupthenumberfromasinglenumber;

public class AddUpTheNumberFromASingleNumber {

    public static void main(String[] args) {
        System.out.println(addUp(13));
    }

    public static int addUp(int num) {
        return num * (num + 1) / 2;
    }
}
