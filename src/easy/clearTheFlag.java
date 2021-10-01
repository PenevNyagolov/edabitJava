package easy;

public class clearTheFlag {
    public static void main(String[] args) {
        System.out.println(clearFog("fogfogFFfoooofftogffreogffesGgfOogfog"));
    }
    public static String clearFog(String str) {

         String a = str.replaceAll("[^a-eh-n-p-zA-EH-N-P-Z]", "");
         if (a.equals(str)) {
             return "It's a clear day!";
         }else {
             return a;
         }
    }
}

//    clearFog("sky") ➞ "It's a clear day!"
//
//        clearFog("fogfogFFfoooofftogffreogffesGgfOogfog") ➞ "trees"
//
//        clearFog("fogFogFogffoObirdsanffodthebffoeffoesGGGfOgFog") ➞ "birdsandthebees"

