package easy;

public class partyBitValidation {
    public static void main(String[] args) {
        String a = "11000000001";
        String[] b = a.split("");
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("1")){
                c++;
            }
        }
        if (c % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println(validateBinary("110001001"));
    }
    public static boolean validateBinary(String bits) {
        String[] b = bits.split("");
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("1")){
                c++;
            }
        }
        if (c % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

//    validateBinary("10110010") ➞ true
// The last digit is the parity bit.
// 0 is the last digit.
// 0 means that there should be an even number of 1's.
// There are four 1's.
// Return true.

//        validateBinary("00101101") ➞ true
//
//        validateBinary("11000000") ➞ true
//
//        validateBinary("11000001") ➞ false
