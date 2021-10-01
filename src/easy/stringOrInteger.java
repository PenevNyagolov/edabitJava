package easy;

public class stringOrInteger {
    public static void main(String[] args) {
        System.out.println(intOrString("Hello"));
    }
    public static String intOrString(Object var) {
            if (var instanceof Integer){
                return "int";
             }else {
                return "str";
            }
    }
}

//    intOrString(8) ➞ "int"
//
//        intOrString("Hello") ➞ "str"
//
//        intOrString(9843532) ➞ "int"
