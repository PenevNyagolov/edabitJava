package easy;

public class convertAnumberToBase2 {
    public static void main(String[] args) {
        System.out.println(binary(1));
    }
    public static String binary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
//    binary(1) ➞ "1"
// 1*1 = 1
//
//        binary(5) ➞ "101"
// 1*1 + 1*4 = 5
//
//        binary(10) ➞ "1010"
// 1*2 + 1*8 = 10