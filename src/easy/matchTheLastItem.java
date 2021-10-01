package easy;

public class matchTheLastItem {
    public static void main(String[] args) {
        String[] a = {"i", "love", "tesh", "ilovetesh"};
//        String b = "";
//        for (int i = 0; i < a.length - 1; i++) {
//            b += a[i];
////            System.out.println(a[i]);
//        }
//        System.out.println(b);
//        System.out.println(String.join(a));
        System.out.println(matchLastItem(a));
    }
    public static boolean matchLastItem(String[] t) {
        String b = "";
        for (int i = 0; i < t.length - 1; i++) {
            b += t[i];
        }
        if (b.equals(t[t.length - 1])){
            return true;
        }else {
            return false;
        }

    }
}

//    matchLastItem(["i", "love", "tesh", "ilovetesh"]) ➞ true
// The last item is the rest joined.
//        *
//        matchLastItem(["i", "am", "into", "her", "world", "iamintoherworld"]) ➞ true
// The last item is the rest joined.

//        matchLastItem(["1", "1", "1", "11"]) ➞ false
// The last item should be "111".

//        matchLastItem(["12", "13", "17", "19", "20", "40", "121317192040"]) ➞ true
