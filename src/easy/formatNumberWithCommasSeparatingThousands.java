package easy;

import java.text.NumberFormat;

public class formatNumberWithCommasSeparatingThousands {
    public static void main(String[] args) {
        System.out.println(formatNum(100000));
    }
    public static String formatNum(int num) {
        NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);
         return myFormat.format(num);

    }
}

//    formatNum(1000) ➞ "1,000"
//
//        formatNum(100000) ➞ "100,000"
//
//        formatNum(20) ➞ "20"
