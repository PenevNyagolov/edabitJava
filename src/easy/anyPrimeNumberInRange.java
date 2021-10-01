package easy;

public class anyPrimeNumberInRange {
    public static void main(String[] args) {
        System.out.println(PrimeNumberInRange(10,15));
    }
    public static boolean PrimeNumberInRange(int n1, int n2) {
        boolean isPrime=true;
        for(int i=n1;i<=n2;i++){
            isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }if(isPrime==true){
                return isPrime;
            }
        }return isPrime;
    }
}

//    PrimeNumberInRange(10, 15) ➞ true
// Prime numbers in range: 11, 13

//        PrimeNumberInRange(62, 66) ➞ false
// No prime numbers in range.

//        PrimeNumberInRange(3, 5) ➞ true
// Prime numbers in range: 3, 5
