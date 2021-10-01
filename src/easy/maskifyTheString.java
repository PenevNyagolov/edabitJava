package easy;

public class maskifyTheString {
    public static void main(String[] args) {
        String v ="4556364607935616";
        System.out.println(v.replaceAll("[0-9]","#"));
        System.out.println(maskify(")E$aCU=e\\\"_"));
    }
    public static String maskify(String s) {
        String lastFourDigits = "";
        String a = "";
        String firstDigits = "";
        if (s.length() > 4)
        {
            lastFourDigits = s.substring(s.length() - 4);
            firstDigits = s.substring(0,s.length() - 4);
            a = firstDigits.replaceAll("[0-9,a-zA-Z,$,(),>,<,+,?,:,/]","#");
        }
        else
        {
            a = s;
        }
        return a + lastFourDigits;
    }
}

//    maskify("4556364607935616") ➞ "############5616"
//
//        maskify("64607935616") ➞ "#######5616"
//
//        maskify("1") ➞ "1"
//
//        maskify("") ➞ ""
