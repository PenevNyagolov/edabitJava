package easy;

import java.util.Arrays;

public class removeTheLettersABC {
    public static void main(String[] args) {
        System.out.println(removeABC("Hello word"));
    }
    public static String removeABC(String words) {
        if(words.contains("a") || words.contains("b") || words.contains("c")) {
            return words.replaceAll("[abcABC]", "");
        }
        else {
            return null;
        }
    }
}
//    removeABC("Tesha is my world") ➞ "Tesh is my world"
//
//        removeABC("This might be a bit hard") ➞ "This might e  it hrd"
//
//        removeABC("hello world!") ➞ null
//
//        removeABC("") ➞ null