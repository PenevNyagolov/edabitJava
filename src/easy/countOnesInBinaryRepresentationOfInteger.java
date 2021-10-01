package easy;

public class countOnesInBinaryRepresentationOfInteger {
    public static void main(String[] args) {

        System.out.println(countOnes(100));
    }
    public static int countOnes(int n) {

        return Integer.bitCount(n);
    }
}

//    countOnes(0) ➞ 0
//        countOnes(100) ➞ 3
//
//        countOnes(999) ➞ 8