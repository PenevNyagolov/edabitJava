package easy;

public class halveAndHalveAgain {
    public static void main(String[] args) {
        System.out.println(halveCount(1000,3));
    }
    public static int halveCount(int a, int b) {
            int c = 0;
            double s = a;
            double x = b;
            while (s > x){
//              if (a / 2 == b){
                  s = s / 2;
                  c++;
//              }
            }
            return c - 1;
    }
}

//    halveCount(1324, 98) ➞ 3
// (1324 -> 662 -> 331 -> 165.5)

//        halveCount(624, 8) ➞ 6
// (624 -> 312 -> 156 -> 78 -> 39 -> 19.5 -> 9.75)

//        halveCount(1000, 3) ➞ 8
// (1000 -> 500 -> 250 -> 125 -> 62.5 -> 31.25 -> 15.625 -> 7.8125 -> 3.90625)
