package opit;

public class edaaaaabit {
    public static void main(String[] args) {

        System.out.println(howManyTimes(0));
    }
    public static String howManyTimes(int num) {

        String a ="a";
        String result = "";
        for (int i = 0; i < num; i++) {
            result += a;
        }
        return "Ed" + result + "bit";
    }
}
//howManyTimes(5) ➞ "Edaaaaabit"
//howManyTimes(0) ➞ "Edbit"
//howManyTimes(12) ➞ "Edaaaaaaaaaaaabit"

