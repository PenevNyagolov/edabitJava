package easy;

public class solvingExponentialEquationsWithLogarithms {
    public static void main(String[] args) {
        double a = Math.log10(1024.0) / Math.log10(2.0);
        System.out.println(a);
        System.out.println(solveForExp(4,1024));
    }
    public static int solveForExp(int a, int b) {
        double c = Math.log10(b) / Math.log10(a);
        return (int) c;
    }
}

//    solveForExp(4, 1024) ➞ 5
//
//        solveForExp(2, 1024) ➞ 10
//
//        solveForExp(9, 3486784401) ➞ 10
