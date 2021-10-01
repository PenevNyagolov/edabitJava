package easy;

public class manyOperators {
    public static void main(String[] args) {
        System.out.println(operate(1,1,"+"));
    }
    public static int operate(int a, int b, String op) {
          int s = 0;
          switch (op){
              case "+":
                  s = a + b;
                  break;
              case "-":
                  s = b - a;
                  break;
              case "*":
                  s = a * b;
                  break;
              case  "/":
                  s = a / b;
                  break;
              case "%":
                  s = a % b;
                  break;
          }
          return s;
    }
}
//+, -, *, /, and %
//    operate(1, 2, "+") ➞ 3
// 1 + 2 = 3

//        operate(7, 10, "-") ➞ -3
// 7 - 10 = -3

//        operate(20, 10, "%") ➞ 0
// 20 % 10 = 0
