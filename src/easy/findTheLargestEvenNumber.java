package easy;

public class findTheLargestEvenNumber {
    public static void main(String[] args) {
         int[] a = {1, 3, 5, 7,0};
        System.out.println(probe(a));
    }
    public static int probe(int[] r) {
        int even = 1;
        for(int i = 0;i < r.length;i++)
        {
            if(r[i] % 2 == 0) {
                if (even == 1) {
                    even = r[i];
                }
                if (even < r[i]) {
                    even = r[i];
                }
            }
        }
        if (even % 2 == 0){
            return even;
        }else {
            return -1;
        }
    }
}

//    probe([3, 7, 2, 1, 7, 9, 10, 13]) ➞ 10
//
//        probe([1, 3, 5, 7]) ➞ -1
//
//        probe([0, 19, 18973623]) ➞ 0
