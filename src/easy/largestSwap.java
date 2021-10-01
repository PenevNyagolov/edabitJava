package easy;

public class largestSwap {
    public static void main(String[] args) {

        System.out.println(largestSwap(53));
    }
    public static boolean largestSwap(int num) {

        char[] a = String.valueOf(num).toCharArray();
        for (int i = 0; i < a.length - 1; i += 2) {
            char tmp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = tmp;
        }
        int number = Integer.parseInt(new String(a));
        if (number > num){
            return false;
        }else {
            return true;
        }
    }
}

//    largestSwap(14) ➞ false
//
//        largestSwap(53) ➞ true
//
//        largestSwap(99) ➞ true