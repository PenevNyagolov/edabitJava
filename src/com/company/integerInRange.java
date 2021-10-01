package opit;

public class integerInRange {
    public static void main(String[] args) {

        System.out.println(intWithinBounds(6,1,6));
    }
    public static boolean intWithinBounds(int n, int lower, int upper) {

        if(n >= lower && n < upper){
            return  true;
        }else{
            return  false;
        }
    }
}
//    intWithinBounds(3, 1, 9) ➞ true
//     3 >=1 true
//     3 >= 9 false
//        intWithinBounds(6, 1, 6) ➞ false
//
//        intWithinBounds(3, 3, 8) ➞ true
