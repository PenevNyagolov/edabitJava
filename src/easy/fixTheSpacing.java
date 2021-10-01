package easy;

public class fixTheSpacing {
    public static void main(String[] args) {
        System.out.println(correctSpacing("The film   starts       at      midnight. "));
    }
    public static String correctSpacing(String sentence) {
        return sentence.replaceAll("\\s{1,}", " ").trim();
    }
}

//    correctSpacing("The film   starts       at      midnight. ")
//➞ "The film starts at midnight."
//
//        correctSpacing("The     waves were crashing  on the     shore.   ")
//        ➞ "The waves were crashing on the shore."
//
//        correctSpacing(" Always look on    the bright   side of  life.")
//        ➞ "Always look on the bright side of life."

