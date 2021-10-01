package easy;

public class hidingTheCardNumber {
    public static void main(String[] args) {
        System.out.println(cardHide("1234123456785678"));
    }
    public static String cardHide(String card) {
        String lastFourDigits = "";
        String a = "";
        String firstDigits = "";

        lastFourDigits = card.substring(card.length() - 4);
        firstDigits = card.substring(0,card.length() - 4);
        a = firstDigits.replaceAll("[0-9]","*");
        return a + lastFourDigits;
    }
}

//    cardHide("1234123456785678") ➞ "************5678"
//
//        cardHide("8754456321113213") ➞ "************3213"
//
//        cardHide("35123413355523") ➞ "**********5523"

