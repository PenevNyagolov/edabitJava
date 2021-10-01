package easy;

public class littleBigSequence {
    public static void main(String[] args) {
        System.out.println(littleBig(4));
    }
    public static int littleBig(int n) {
        return n%2<1 ? (int)Math.pow(2,n/2)*50 : n/2+5;
    }
}

//    littleBig(4) ➞ 200
//
//        littleBig(5) ➞ 7
//
//        littleBig(28) ➞ 819200
//==============================================
//public static int littleBig(int n) {
//        if (n == 1){
//        return 5;
//        }
//        int[] arr = new int[n];
//        arr[0] = 5;
//        arr[1] = 100;
//        int inc = 6;
//        int index = 2;
//        for (int i =2; i < n ; i++){
//        if (i % 2 == 0) {
//        arr[index++] = inc++;
//        } else {
//        arr[index++] = arr[i-2] * 2;
//        }
//        }
//
//        return arr[n-1];
//        }