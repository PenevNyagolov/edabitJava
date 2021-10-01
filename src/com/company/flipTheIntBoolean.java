package opit;

public class flipTheIntBoolean {
    public static void main(String[] args) {
        System.out.println(flipIntBool(1));
    }
    public static int flipIntBool(int intBool) {

        if (intBool > 0){
            return 0;
        }else{
            return 1;
        }

    }
    //flipIntBool(1) ➞ 0

    //flipIntBool(0) ➞ 1
}
