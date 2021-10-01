//Convert Number to Corresponding Month Name
//Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string. For example, if you're given 3 as input, your function should return "March", because March is the 3rd month.
//
//Number	Month Name
//1	January
//2	February
//3	March
//4	April
//5	May
//6	June
//7	July
//8	August
//9	September
//10	October
//11	November
//12	December
//Examples
//monthName(3) ➞ "March"
//
//monthName(12) ➞ "December"
//
//monthName(6) ➞ "June"
package convertnumbertocorrespondingmonth;

public class ConvertNumberToCorrespondingMonth {

    public static void main(String[] args) {
        System.out.println(monthName(3));
    }

    public static String monthName(int num) {
        if (num == 1) {
            return "January";
        }
        if (num == 2) {
            return "February";
        }
        if (num == 3) {
            return "March";
        }
        if (num == 4) {
            return "April";
        }
        if (num == 5) {
            return "May";
        }
        if (num == 6) {
            return "June";
        }
        if (num == 7) {
            return "July";
        }
        if (num == 8) {
            return "August";
        }
        if (num == 9) {
            return "September";
        }
        if (num == 10) {
            return "October";
        }
        if (num == 11) {
            return "November";
        }
        if (num == 12) {
            return "December";
        } else {
            return null;
        }
    }
}


//public static String monthName(int num) {
//		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",} ;
//		return months[num-1];
//	}
//
