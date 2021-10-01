package opit;

public class smallerStringNumber {
    public static void main(String[] args) {

        System.out.println(smallerNum("23","44"));
    }
    public static String smallerNum(String n1, String n2) {

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        if (a > b){
            return String.valueOf(b);
        }else {
            return String.valueOf(a);
        }
    }
}
//smallerNum("21", "44") ➞ "21"
//smallerNum("1500", "1") ➞ "1"
//smallerNum("5", "5") ➞ "5"
