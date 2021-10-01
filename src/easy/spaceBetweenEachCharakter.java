package easy;

public class spaceBetweenEachCharakter {
    public static void main(String[] args) {
        System.out.println(spaceMeOut("far out"));
    }
    public static String spaceMeOut(String str) {

        String b = " ";
        char[] a = str.toCharArray();
        for(int i = 0;i < a.length;i++){
            //System.out.println("Data at ["+i+"]="+arr[i]);
            b += String.valueOf(a[i]);

        }
        return b.trim();
    }
}
//    spaceMeOut("space") ➞ "s p a c e"
//
//        spaceMeOut("far out") ➞ "f a r  o u t"
//
//        spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"