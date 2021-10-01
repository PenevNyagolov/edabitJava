package opit;

public class bitwiseOperation {
    public static void main(String[] args) {

        System.out.println(bitwiseAND(7,12));
        System.out.println(bitwiseOR(7,12));
        System.out.println(bitwiseXOR(7,12));
    }
    public static int bitwiseAND(int n1, int n2) {
        int result = n1 & n2;
        return result;
    }

    public static int bitwiseOR(int n1, int n2) {
        int result = n1 | n2;
        return result;
    }

    public static int bitwiseXOR(int n1, int n2) {
        int result = n1 ^ n2;
        return result;
    }
}

//bitwiseAND(7, 12) ➞ 4
//bitwiseOR(7, 12) ➞ 15
//bitwiseXOR(7, 12) ➞ 11
