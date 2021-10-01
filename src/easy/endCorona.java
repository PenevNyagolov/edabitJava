package easy;

public class endCorona {
    public static void main(String[] args) {

        System.out.println(endCorona(3000,2000,50699));
    }
    public static int endCorona(int recovers, int newCases, int activeCases) {
         int days = 0;
         while (activeCases > 0){
                activeCases = (activeCases + newCases) - recovers;
                days++;
         }
         return days;
    }
}
//    endCorona(4000, 2000, 77000) ➞ 39
//
//        endCorona(3000, 2000, 50699) ➞ 51
//
//        endCorona(30000, 25000, 390205) ➞ 79