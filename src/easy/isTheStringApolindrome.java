package easy;

public class isTheStringApolindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("mom"));
    }
    public static boolean checkPalindrome(String str) {

        char[] charArray = str.toUpperCase().toCharArray();
        for(int i=0; i < str.length(); i++) {
            if(charArray[i] != charArray[(str.length()-1) - i]) {
                return false;
            }
        }
        return true;
    }
}

//    checkPalindrome("mom") ➞ true
//
//        checkPalindrome("scary") ➞ false
//
//        checkPalindrome("reviver") ➞ true
//
//        checkPalindrome("stressed") ➞ false