package easy;

public class transformingWordsIntoBinaryString {
    public static void main(String[] args) {

        System.out.println(convertBinary("excLAIM"));
    }
    public static String convertBinary(String str) {

        String a = str.toLowerCase().replaceAll("[a-m]","0");
        String b = a.toLowerCase().replaceAll("[n-z]","1");

        return b;
    }
}

//    convertBinary("house") ➞ "01110"
//
//        convertBinary("excLAIM") ➞ "0100000"
//
//        convertBinary("moon") ➞ "0111"
