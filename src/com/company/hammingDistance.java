package opit;

public class hammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance("abcde", "bcdef"));
    }
    public static int hammingDistance(String str1, String str2) {
        int i = 0, count = 0;
        while (i < str1.length())
        {
            if (str1.charAt(i) != str2.charAt(i))
                count++;
            i++;
        }
        return count;
    }
}

//hammingDistance("abcde", "bcdef") ➞ 5
//hammingDistance("abcde", "abcde") ➞ 0
//hammingDistance("strong", "strung") ➞ 1
