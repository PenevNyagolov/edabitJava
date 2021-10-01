package easy;

public class prefixesVSsuffixes {
    public static void main(String[] args) {
    String b = "auto-";
    String a = b.replaceAll("-","");
    System.out.println(a);
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
    }
    public static boolean isPrefix(String word, String prefix) {

       String a = prefix.replace("-","");
       return word.startsWith(a);
    }

    public static boolean isSuffix(String word, String suffix) {
       String a = suffix.replaceAll("-","");
       return word.endsWith(a);
    }
    
}

//    isPrefix("automation", "auto-") ➞ true
//
//        isSuffix("arachnophobia", "-phobia") ➞ true
//
//        isPrefix("retrospect", "sub-") ➞ false
//
//        isSuffix("vocation", "-logy") ➞ false

