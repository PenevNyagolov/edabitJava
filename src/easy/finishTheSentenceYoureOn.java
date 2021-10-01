package easy;

import java.util.Arrays;

public class finishTheSentenceYoureOn {
    public static void main(String[] args) {
        String a = "I wanna tell the world Tesh, that I love you so!";
        String b = "I wanna tell the world Tesh, that";
        String c = a.replaceAll(b,"");
        String v = c.replaceAll("\\s","");
        System.out.println(v.length()/2);
        System.out.println(timeToFinish("I wanna tell the world Tesh, that I love you so!", "I wanna tell the world Tesh, that"));
    }
    public static int timeToFinish(String full, String part) {
        String c = full.replaceAll(part,"");
        String v = c.replaceAll("\\s","");
        return v.length()/2;
    }
}

//    timeToFinish(
//  "I wanna tell the world Tesh, that I love you so!",
//          "I wanna tell the world Tesh, that"
//    ) ➞ 5

// "I" has 1 character
// "love" has 4 characters
// "you" has 3 characters
// "so!" has 3 characters, including punctuation.
// 1 + 4 + 3 + 3 = 11
// 11 / 2 = 5
// Remember not to include spaces.
//        timeToFinish(
//        "I'm so preoccupied by the thougths of you Tesh.",
//        "I'm so preoccupied by the"
//        ) ➞ 9
//
//        timeToFinish(
//        "And so brings my conclusion to its conclusion.",
//        "And so brings my conclusion to its conclus"
//        ) ➞ 2
//
//        timeToFinish(
//        "I wanna tell the world Tesh, that I love you so!",
//        "I wanna tell the world"
//        ) ➞ 10
//
//        timeToFinish(
//        "As a result, my point is still valid.",
//        "As a result, my"
//        ) ➞ 9

