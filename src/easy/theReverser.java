package easy;

public class theReverser {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
    }
    public static String reverse(String text) {
        char[] inputStringArray = text.toCharArray();
        String reverseString = "";
        for (int i = inputStringArray.length - 1; i >= 0; i--) {
//            reverseString += inputStringArray[i];
            if (Character.isLowerCase(inputStringArray[i])){
                reverseString += Character.toString(inputStringArray[i]).toUpperCase();
            }else {
                reverseString += Character.toString(inputStringArray[i]).toLowerCase();
            }
        }
        return reverseString;
    }
}

//    reverse("Hello World") ➞ "DLROw OLLEh"
//
//        reverse("ReVeRsE") ➞ "eSrEvEr"
//
//        reverse("Java compiler") ➞ "RELIPMOC AVAj"
