package easy;

import java.util.Arrays;

public class semanticVersioning {
    public static void main(String[] args) {
//        String a = "5.12.13";
//        String [] imageNameArray = a.split("\\.");
//        for(int i =0; i< imageNameArray.length ; i++)
//        {
//            System.out.println(imageNameArray[1]);
//        }
        //System.out.println(Arrays.toString(a));

        System.out.println(retrieveMajor("5.12.13"));
        System.out.println(retrieveMinor("5.12.13"));
        System.out.println(retrievePatch("5.12.13"));
    }
    public static String retrieveMajor(String semver) {
        String [] a = semver.split("\\.");
        String b = "";
        for(int i =0; i< a.length ; i++)
        {
            b = a[0];
        }
        return b;
    }

    public static String retrieveMinor(String semver) {
        String [] a = semver.split("\\.");
        String b = "";
        for(int i =0; i< a.length ; i++)
        {
            b = a[1];
        }
        return b;
    }

    public static String retrievePatch(String semver) {
        String [] a = semver.split("\\.");
        String b = "";
        for(int i =0; i< a.length ; i++)
        {
            b = a[2];
        }
        return b;
    }
}

    // 6.1.9
//    retrieveMajor("6.1.9") ➞ "6"
//
//        retrieveMinor("6.1.9") ➞ "1"
//
//        retrievePatch("6.1.9") ➞ "9"

// 2.1.0
//        retrieveMajor("2.1.0") ➞ "2"
//
//        retrieveMinor("2.1.0") ➞ "1"
//
//        retrievePatch("2.1.0") ➞ "0"