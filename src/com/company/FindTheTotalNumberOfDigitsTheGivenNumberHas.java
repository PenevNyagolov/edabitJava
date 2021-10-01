//Find the Total Number of Digits the Given Number Has
//Create a function that takes a number as an argument and returns the amount of digits it has.
//
//Examples
//findDigitAmount(123) ➞ 3
//
//findDigitAmount(56) ➞ 2
//
//findDigitAmount(7154) ➞ 4
//
//findDigitAmount(61217311514) ➞ 11
//
//findDigitAmount(0) ➞ 1

package findthetotalnumberofdigitsthegivennumberhas;


public class FindTheTotalNumberOfDigitsTheGivenNumberHas {

    
    public static void main(String[] args) {
        System.out.println(findDigitAmount(99999999));
    }
    public static int findDigitAmount(int num) {
      String num1 = Integer.toString(num); 
  
    // calculate the size of string 
      
   return + num1.length();
	}
}

//int count = 0; 
//        while (n != 0) { 
//            n = n / 10; 
//            ++count; 
//        } 
//        return count; 
//////////////////////////
// if (n == 0) 
//            return 0; 
//        return 1 + countDigit(n / 10); 
/////////////////////
//return (int)Math.floor(Math.log10(n) + 1); 