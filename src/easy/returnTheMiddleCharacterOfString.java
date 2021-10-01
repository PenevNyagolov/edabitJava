package easy;

public class returnTheMiddleCharacterOfString {
    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }
    public static String getMiddle(String word) {
        int mid = word.length() / 2;
        return (word.length() % 2 == 1 ? word.substring(mid, mid+1) : word.substring(mid-1, mid+1));

        // return word.substring (word.length()/2 - 1, word.length()/2 + 1);
    }
}

//    getMiddle("test") ➞ "es"
//
//        getMiddle("testing") ➞ "t"
//
//        getMiddle("middle") ➞ "dd"
//
//        getMiddle("A") ➞ "A"
