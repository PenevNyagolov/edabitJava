package easy;

public class fractionGreaterThanOne {
    public static void main(String[] args) {
        System.out.println(greaterThanOne("1/2"));
    }
    public static boolean greaterThanOne(String frac) {
        String[] rat = frac.split("/");
        if (Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]) > 1) {
            return true;
        } else {
            return false;
        }
    }
}

//    greaterThanOne("1/2") ➞ false
//
//        greaterThanOne("7/4") ➞ true
//
//        greaterThanOne("10/10") ➞ false
