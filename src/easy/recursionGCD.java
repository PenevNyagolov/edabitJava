package easy;

public class recursionGCD {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, (a % b));
    }
}
//    gcd(10, 20) ➞ 10
//
//        gcd(1, 3) ➞ 1
//
//        gcd(5, 7) ➞ 1
//
//        gcd(2, 6) ➞ 2