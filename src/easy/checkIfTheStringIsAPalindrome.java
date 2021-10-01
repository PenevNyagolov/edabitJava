package easy;

public class checkIfTheStringIsAPalindrome {
    public static void main(String[] args) {
       System.out.println(isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-z]","");
        str = str.toUpperCase();
        int n = str.length();
        for(int i = 0 ; i < n/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }

        return true;

    }
}

//    isPalindrome("Neuquen") ➞ true
//
//        isPalindrome("Not a palindrome") ➞ false
//        isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!") ➞ true
//
