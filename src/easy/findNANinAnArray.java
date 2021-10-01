package easy;

public class findNANinAnArray {
    private static double NaN;

    public static void main(String[] args) {
        double[] arr = {NaN, 1, 2, 3, 4};
        System.out.println(findNaN(arr));
    }
    public static int findNaN(double[] n) {
        for(int i = 0; i < n.length; i++) {
            if(Double.isNaN(n[i])) {
                return i;
            }
        }
        return -1;
    }
}

//    findNaN([1, 2, NaN]) ➞ 2
//
//        findNaN([NaN, 1, 2, 3, 4]) ➞ 0
//
//        findNaN([0, 1, 2, 3, 4]) ➞ -1

