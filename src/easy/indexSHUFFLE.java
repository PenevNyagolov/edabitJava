package easy;

public class indexSHUFFLE {
    public static void main(String[] args) {
        System.out.println(indexShuffle("abcdefg"));
    }
    public static String indexShuffle(String str) {
        String even = "";
        String oven = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                even += str.charAt(i);
            else
                oven += str.charAt(i);
        }
        return even + oven;
    }
}

//    indexShuffle("abcdefg") ➞ "acegbdf"
//
//        indexShuffle("holiday") ➞ "hldyoia"
//
//        indexShuffle("maybe") ➞ "myeab"
//indexShuffle("abcd") ➞ "acbd"
// "ac" (even-indexed) + "bd" (odd-indexed)