package easy;

public class removeAllSpecialCharactersFromAstring {
    public static void main(String[] args) {
        System.out.println(removeSpecialCharacters("D0n$c sed 0di0 du1"));
    }
    public static String removeSpecialCharacters(String s) {
            return s.replaceAll("[^\\w\\s-]","");
    }
}

//    removeSpecialCharacters("The quick brown fox!") ➞ "The quick brown fox"
//
//        removeSpecialCharacters("%fd76$fd(-)6GvKlO.") ➞ "fd76fd-6GvKlO"
//
//        removeSpecialCharacters("D0n$c sed 0di0 du1") ➞ "D0nc sed 0di0 du1"
