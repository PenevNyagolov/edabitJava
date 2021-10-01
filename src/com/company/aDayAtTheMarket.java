package com.company;

public class aDayAtTheMarket {
    public static void main(String[] args) {
        System.out.println(whoWinsTonight(20,20,5,10));
    }
    public static String whoWinsTonight(int coins, int space, int price, int size) {
          int a = coins / price;
          int b = space / size;
          if (b > a){
              return "Will";
          }else if (a > b){
              return "Bill";
          }else {
              return "Tie";
          }
    }
}

//    whoWinsTonight(40, 95, 5, 10) ➞ "Will"
// The item costs 5 coins and takes up 10 inventory spaces.
// Bill can only buy a maximum of 8 items (40 coins DIV 5 = 8).
// Will can only bring home a maximum of 9 items. (95 inventory spaces DIV 10 = 9).
// Will is the winner.

//        whoWinsTonight(20, 20, 5, 10) ➞ "Bill"
//
//        whoWinsTonight(10, 2, 20, 1) ➞ "Will"
//
//        whoWinsTonight(3, 7, 2, 5) ➞ "Tie"
