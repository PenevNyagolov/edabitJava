package easy;

public class returnTheIndexOfTheFirstVowel {
    public static void main(String[] args) {

        System.out.println(firstVowel("STRAWBERRY"));
    }
    public static int firstVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                return str.indexOf(c);
            }
        }
        return -1;
    }
}

//    firstVowel("apple") ➞ 0
//
//        firstVowel("hello") ➞ 1
//
//        firstVowel("STRAWBERRY") ➞ 3
//
//        firstVowel("pInEaPPLe") ➞ 1
