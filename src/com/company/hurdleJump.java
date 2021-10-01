package opit;

public class hurdleJump {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(hurdleJump(a, 5));
    }
    public static boolean hurdleJump(int[] hurdles, int h) {
        for(int i = 0; i < hurdles.length; i++)
            if(h < hurdles[i]) return false;
        return true;
    }
}

//hurdleJump([1, 2, 3, 4, 5], 5) ➞ true
//hurdleJump([5, 5, 3, 4, 5], 3) ➞ false
//hurdleJump([5, 4, 5, 6], 10) ➞ true
//hurdleJump([1, 2, 1], 1) ➞ false
