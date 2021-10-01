package opit;

public class removeTheFirstAndLastCersharact {
    public static void main(String[] args) {

        System.out.println(removeFirstLast("to"));
    }
    public static String removeFirstLast(String str) {

        if (str.length() < 3) {
            return str;
        }else {
            return str.substring(1, str.length() - 1);
        }
    }
}
//removeFirstLast("hello") ➞ "ell"
//removeFirstLast("maybe") ➞ "ayb"
//removeFirstLast("benefit") ➞ "enefi"
//removeFirstLast("a") ➞ "a"
