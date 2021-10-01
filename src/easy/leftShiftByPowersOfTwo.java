package easy;

public class leftShiftByPowersOfTwo {
    public static void main(String[] args) {
        System.out.println(shiftToLeft(10,3));
    }
    public static int shiftToLeft(int x, int y) {
        double a = Double.valueOf(x);
        double b = Double.valueOf(y);
//        double c = Math.pow(a,b);
        double v = a * Math.pow(2,b);
        int d = (int) v;
        return d;
    }
}
