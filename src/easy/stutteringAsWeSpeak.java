package easy;

public class stutteringAsWeSpeak {
    public static void main(String[] args) {
         System.out.println(stuttering("enticing"));
    }
    public static String stuttering(String word) {

        String a = word.substring(0,2) + "... ";
        String result = "";
            for (int i = 0; i < 2; i++) {
                result += a;
            }
        //String b = a.repeat(2);
        return result + word + "!";
    }
}
