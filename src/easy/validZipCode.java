package easy;

public class validZipCode {
    public static void main(String[] args) {
        System.out.println(isValid("590 01"));
    }
    public static boolean isValid(String zip) {
        return zip.matches("[0-9]{5}");
    }
}

//    isValid("59001") ➞ true
//
//        isValid("853a7") ➞ false
//
//        isValid("732 32") ➞ false
//
//        isValid("393939") ➞ false
