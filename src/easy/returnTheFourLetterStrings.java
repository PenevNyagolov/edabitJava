package easy;

import java.util.Arrays;
import java.util.List;

public class returnTheFourLetterStrings {
    public static void main(String[] args) {
        String[] s = {"Ryan", "Kieran", "Jason", "Matt"};
        System.out.println(Arrays.toString(isFourLetters(s)));
    }
    public static String[] isFourLetters(String[] s) {
        List<String> list = Arrays.asList(s);
        String[] result = Arrays.stream(s)
                .filter(n -> n.length() == 4)
                .toArray(String[]::new);
        return result;
    }
}

//    isFourLetters(["Tomato", "Potato", "Pair"]) ➞ ["Pair"]
//
//        isFourLetters(["Kangaroo", "Bear", "Fox"]) ➞ ["Bear"]
//
//        isFourLetters(["Ryan", "Kieran", "Jason", "Matt"]) ➞ ["Ryan", "Matt"]
