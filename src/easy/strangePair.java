package easy;

public class strangePair {
    public static void main(String[] args) {
        String s2 = "orator";
//        System.out.println(s2.charAt(5));
//        System.out.println(s2.endsWith(String.valueOf(s2.charAt(s2.length() - 1))));
        System.out.println(isStrangePair("a", "b"));
    }
    public static boolean isStrangePair(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) { return true; }
        if (s1.length() == 0 || s2.length() == 0) { return false; }
        return s1.charAt(0) == s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1);
    }
    
}

//    isStrangePair("ratio", "orator") ➞ true
// "ratio" ends with "o" and "orator" starts with "o".
// "ratio" starts with "r" and "orator" ends with "r".

//        isStrangePair("sparkling", "groups") ➞ true
//
//        isStrangePair("bush", "hubris") ➞ false
//
//        isStrangePair("", "") ➞ true
//String s = "Strings are immutable";
//    char result = s.charAt(8);