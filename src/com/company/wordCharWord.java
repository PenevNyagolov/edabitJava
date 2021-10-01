package opit;

public class wordCharWord {
    public static void main(String[] args) {

        System.out.println(add("#", "you me world"));
    }

    public static String add(String c, String str) {

        String a = str.replace(" ",c);
        return a;
    }

}

//        add("#", "hello world!") ➞ "hello#world!"
//        add("&", "you me world") ➞ "you&me&world"
