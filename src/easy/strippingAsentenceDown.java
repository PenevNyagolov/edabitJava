package easy;

public class strippingAsentenceDown {
    public static void main(String[] args) {
        System.out.println(stripSentence("the quick brown fox jumps over the lazy dog", "aeiou"));
    }
    public static String stripSentence(String str, String chars) {
        return str.replaceAll("["+chars+"]","");
    }
}

//    stripSentence("the quick brown fox jumps over the lazy dog", "aeiou") ➞ "th qck brwn fx jmps vr th lzy dg"
//
//        stripSentence("the hissing snakes sinisterly slither across the rustling leaves", "s") ➞ "the hiing nake initerly lither acro the rutling leave"
//
//        stripSentence("gone, reduced to atoms", "go, muscat nerd") ➞ ""
//public static String stripSentence(String str, String chars) {
//    for (int i = 0; i < str.length(); i++) {
//        for (int j = 0; j < chars.length(); j++) {
//            str = str.replace(String.valueOf(chars.charAt(j)), "");
//        }
//    }
//    return str;
//}
