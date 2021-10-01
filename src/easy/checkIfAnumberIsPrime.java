package easy;

public class checkIfAnumberIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }
    public static boolean isPrime(int num) {
        if (num == 1){
            return false;
        }else {
            for (int divisor = 2; divisor < num; divisor++) {
                if (num != divisor && num % divisor == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
//    isPrime(31) ➞ true
//
//        isPrime(18) ➞ false
//
//        isPrime(11) ➞ true