package easy;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        System.out.println(gcd(32,8));
    }
    public static int gcd(int n1, int n2) {
        while(n1 != n2)
        {
            if(n1 > n2) {
                n1 -= n2;
            }else {
                n2 -= n1;
            }
        }
        return n1;
    }
}

//    gcd(32, 8) ➞ 8
//
//        gcd(8, 12) ➞ 4
//
//        gcd(17, 13) ➞ 1
