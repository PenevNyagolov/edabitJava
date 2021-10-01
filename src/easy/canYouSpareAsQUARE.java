package easy;

public class canYouSpareAsQUARE {
    public static void main(String[] args) {
        System.out.println(tpChecker(4,1));
    }
    public static String tpChecker(int people, int tp) {
        int days = (500 * tp) / (people * 57);
        if (days < 14) {
            return "Your TP will only last " + days + " days, buy more!";
        } else {
            return "Your TP will last " + days + " days, no need to panic!";
        }
    }
}

//    tpChecker(4, 1) ➞ "Your TP will only last 2 days, buy more!"
//
//        tpChecker(3, 20) ➞ "Your TP will last 58 days, no need to panic!"
//
//        tpChecker(4, 12) ➞ "Your TP will last 26 days, no need to panic!"
