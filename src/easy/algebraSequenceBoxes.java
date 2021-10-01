package easy;

public class algebraSequenceBoxes {
    public static void main(String[] args) {
        System.out.println(boxSeq(1));
    }
    public static int boxSeq(int step) {
        if(step % 2 == 0)
            return step;
        return step+2;
    }
}

//    boxSeq(0) ➞ 0
//
//        boxSeq(1) ➞ 3
//
//        boxSeq(2) ➞ 2
