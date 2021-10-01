package easy;

public class isThePhoneNumberFormattedCorrectly {
    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("1111)555 2345"));
    }
    public static boolean isValidPhoneNumber(String s) {
        return s.matches("(\\(\\d{3}\\)( )\\d{3}-\\d{4})");
    }
}

//    isValidPhoneNumber("(123) 456-7890") ➞ true
//
//        isValidPhoneNumber("1111)555 2345") ➞ false
//
//        isValidPhoneNumber("098) 123 4567") ➞ false
