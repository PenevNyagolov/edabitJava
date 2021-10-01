package opit;

public class snailGoesUpTheStairs {
    public static void main(String[] args) {
        System.out.println(TotalDistance(0.2,0.4,100.0));
    }
    public static double TotalDistance(double height, double length, double tower) {
        return tower/height * (length+height);
    }
}
//
//TotalDistance(0.2, 0.4, 100.0) ➞ 300.0
//TotalDistance(0.3, 0.2, 25.0) ➞ 41.7
//TotalDistance(0.1, 0.1, 6.0) ➞ 12
