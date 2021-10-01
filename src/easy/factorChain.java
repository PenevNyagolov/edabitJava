package easy;

public class factorChain {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7, 12};
//        for (int i = 0; i < a.length; i++) {
//            if (a[a.length - 1] % a[i] == 0){
//                System.out.print(a[i] + ",");
//            }else {
//                a[i] = 0;
//            }
//        }
        System.out.println(factorChain(a));
    }
    public static boolean factorChain(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] % arr[i] != 0) {
                return true;
            }
        }
                return false;
    }
}

//    factorChain([1, 2, 4, 8, 16, 32]) ➞ true
//
//        factorChain([1, 1, 1, 1, 1, 1]) ➞ true
//
//        factorChain([2, 4, 6, 7, 12]) ➞ false
//
//        factorChain([10, 1]) ➞ false
