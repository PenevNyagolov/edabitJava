//Free Coffee Cups
//Per 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Create a function that takes n cups bought and return as an integer the total number of cups I would get.
//
//Examples
//totalCups(6) ➞ 7
//
//totalCups(12) ➞ 14
//
//totalCups(213) ➞ 248
//Notes
//Number of cups I bought + number of cups I got for free.
package freecoffeecups;

public class FreeCoffeeCups {

    public static void main(String[] args) {
        int freeCups = 0;
        for (int i = 1; i <= 213; i++) {
            if (i % 6 == 0) {
                System.out.println(freeCups += 1);
            }
        }
        System.out.println(freeCups + 213);
        //System.out.println(totalCups(213));
    }

    public static int totalCups(int n) {
        int freeCups = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0) {
                freeCups += 1;
            }
        }
        return freeCups + n;
//return (n / 6) + n;
    }
}
