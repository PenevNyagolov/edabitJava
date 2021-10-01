package easy;

public class howManyDecimalPlaces {
    public static void main(String[] args) {
        double a = (long)3.1 % 1;
        System.out.println((int) Math.round(a));
        System.out.println(getDecimalPlaces("3.1"));
    }
    public static int getDecimalPlaces(String num) {
        if(!num.contains("."))
            return 0;
        else
            return num.length()-1-num.indexOf(".");

    }
}

//    getDecimalPlaces("43.20") ➞ 2
//
//        getDecimalPlaces("400") ➞ 0
//
//        getDecimalPlaces("3.1") ➞ 1
//
