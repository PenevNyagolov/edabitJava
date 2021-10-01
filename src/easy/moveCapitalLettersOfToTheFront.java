package easy;

public class moveCapitalLettersOfToTheFront {
    public static void main(String[] args) {
        String a = "hApPy";
        String b = a.replaceAll("[a-z]","");
        String c = a.replaceAll("[A-Z]","");
        System.out.println(b + c);
        System.out.println(capToFront("hApPy"));
    }
    public static String capToFront(String str) {
        String b = str.replaceAll("[a-z]","");
        String c = str.replaceAll("[A-Z]","");
        return b + c;
    }
}

//    capToFront("hApPy") ➞ "APhpy"
//
//        capToFront("moveMENT") ➞ "MENTmove"
//
//        capToFront("shOrtCAKE") ➞ "OCAKEshrt"
//
