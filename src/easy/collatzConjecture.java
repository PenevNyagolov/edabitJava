package easy;

public class collatzConjecture {
    public static void main(String[] args) {
        System.out.println(collatzConjecture(10));
}   public static int collatzConjecture(int n) {
        int i = 0;
        while (n != 1) {

            if (n % 2 == 0) {
                n = (n / 2);
            } else {
                n = (3 * n + 1);
            }
            i++;

        }
        return i;
    }
}

//    collatzConjecture(2) ➞ 1
//
//        collatzConjecture(3) ➞ 7
//
//        collatzConjecture(10) ➞ 6