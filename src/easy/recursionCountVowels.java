package easy;

public class recursionCountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("apple"));
    }
    public static int countVowels(String str) {

            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) ||
                        'O' == str.charAt(i) || 'u' == str.charAt(i)) {
                    ++count;
                }
            return count;
        }

}
//    All letters will be in lower case.
//        Vowels are: a, e, i, o, u.
//    countVowels("apple") ➞ 2
//
//        countVowels("cheesecake") ➞ 5
//
//        countVowels("bbb") ➞ 0
//
//        countVowels("") ➞ 0
