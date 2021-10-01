//Calculate Using String Operation
//Create a function that takes two numbers and a mathematical operator and returns the result.
//
//Examples
//calculate(4, 9, "+") ➞ 13
//
//calculate(12, 5, "-") ➞ 7
//
//calculate(6, 3, "*") ➞ 18
//
//calculate(25, 5, "/") ➞ 5
//
//calculate(14, 3, "%") ➞ 2
package calculateusingstringoperation;

public class CalculateUsingStringOperation {

    public static void main(String[] args) {
        System.out.println(calculate(25, 5, "/"));
    }

    public static int calculate(int num1, int num2, String operation) {
        
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else if (operation.equals("/")) {
            return num1 / num2;
        }else  if (operation.equals("%")) {
            return num1 % num2;
        }
        else {
            return -1;
        }
    }
}
