package easy;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(32));
    }
    public static boolean powerOfTwo(int num) {
        int b = num / 2;
        if (b % 2== 0){
            return true;
        }else {
            return false;
        }
    }
}

//    powerOfTwo(32) ➞ true
//
//        powerOfTwo(1) ➞ true
//
//        powerOfTwo(-7) ➞ false
//
//        powerOfTwo(18) ➞ false
