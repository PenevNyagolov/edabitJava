package opit;

public class numberOfStickers {
    public static void main(String[] args) {

        System.out.println(howManyStickers(2));
    }
    public static int howManyStickers(int n) {
        return (int) Math.pow(n,2) * 6;
    }
}
//howManyStickers(1) ➞ 6
//howManyStickers(2) ➞ 24
//howManyStickers(3) ➞ 54