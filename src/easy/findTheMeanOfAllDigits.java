package easy;

public class findTheMeanOfAllDigits {
    public static void main(String[] args) {
        int a = 42;
        String s = String.valueOf(a);
        System.out.println(s.length());
        System.out.println(mean(42));
    }
    public static int mean(int a) {
        int sum = 0;
        int num = a;
        String s = String.valueOf(a);
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum / s.length();
    }
}

//    mean(42) ➞ 3
//
//        mean(12345) ➞ 3
//
//        mean(666) ➞ 6
