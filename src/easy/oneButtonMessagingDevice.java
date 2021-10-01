package easy;

public class oneButtonMessagingDevice {
    public static void main(String[] args) {
        System.out.println(142 % 10);
        String s = "qudusayo";
        System.out.println((int)s.charAt(0));
        String o = "";
        int b = 0;
        for(int i = 0; i < s.length(); i++){
            b += (int) s.charAt(i) - 96;
//            o += Integer.toOctalString(s.charAt(i) / 10);
//            b += Integer.parseInt(o);
        }
        System.out.println(b);
        System.out.println(howManyTimes(s));
    }
    public static int howManyTimes(String msg) {
        int b = 0;
        for(int i = 0; i < msg.length(); i++){
            b += (int) msg.charAt(i) - 96;
        }
        return b;
    }
}
//    howManyTimes("abde") ➞ 12
//
//        howManyTimes("azy") ➞ 52
//
//        howManyTimes("qudusayo") ➞ 123