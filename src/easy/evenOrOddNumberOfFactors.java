package easy;

public class evenOrOddNumberOfFactors {
    public static void main(String[] args) {
        double a = Math.sqrt(1.0);
//        System.out.println(1.0 % 2.0);
        for(long i = 1; i <= Math.sqrt(18.0); i++) {
            if(18.0 % i == 0) {
                System.out.println(i);
                if(i != 18.0/i) {
//                    System.out.println(18/i);
                }
            }
        }
        System.out.println(factorGroup(1));
    }
    public static String factorGroup(int num) {
        if(Math.sqrt(num) == (int)(Math.sqrt(num))){
            return "odd";
        }
        else{
            return "even";
        }
    }
}

//    factorGroup(33) ➞ "even"
//
//        factorGroup(36) ➞ "odd"
//
//        factorGroup(7) ➞ "even"
