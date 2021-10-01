package easy;

public class alternatingOnesAndZeroes {
    public static void main(String[] args) {

        System.out.println(canAlternate("010001"));
    }
    public static boolean canAlternate(String str) {
        char someChar = '0';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar) {
                count++;
            }
        }
        char r = '1';
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == r) {
                sum++;
            }
        }
        if (sum - count == 1 || count - sum == 1 || sum == count){
            return true;
        }else {
            return false;
        }
    }
}

//    canAlternate("0001111") ➞ true
// Can make: "1010101"
//     canAlternate("01001") ➞ true
// Can make: "01010"
//        canAlternate("010001") ➞ false
//        canAlternate("1111") ➞ false
