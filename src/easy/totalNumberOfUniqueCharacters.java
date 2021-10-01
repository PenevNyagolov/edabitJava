package easy;

public class totalNumberOfUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(countUnique("apple","play"));
    }
    public static int countUnique(String s1, String s2) {
        String s = s1 + s2;
        String str = new String();
        int len = s.length();

        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }

        return str.length();
    }
}

//    countUnique("apple", "play") ➞ 5
// "appleplay" has 5 unique characters:
// "a", "e", "l", "p", "y"

//        countUnique("sore", "zebra") ➞ 7
//
//        countUnique("a", "soup") ➞ 5
