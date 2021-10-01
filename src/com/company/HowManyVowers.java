//How Many Vowels?
//Create a function that takes a string and returns the number (count) of vowels contained within it.
//
//Examples
//countVowels("Celebration") ➞ 5
//
//countVowels("Palm") ➞ 1
//
//countVowels("Prediction") ➞ 4
//Notes
//a, e, i, o, u are considered vowels (not y).
//All test cases are one word and only contain letters.
package howmanyvowers;

public class HowManyVowers {

    public static void main(String[] args) {
        System.out.println(getCount("Celebration"));
    }

    public static int getCount(String str) {
        
        String line = str.toLowerCase();
        int vowelsCount = 0;
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowelsCount;
            }
       
        }
       return vowelsCount; 
        
    }
}
