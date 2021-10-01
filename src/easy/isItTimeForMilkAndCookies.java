package easy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class isItTimeForMilkAndCookies {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar(2013,11,24);
        System.out.println(timeForMilkAndCookies(date));
    }
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        int a = date.get(Calendar.DAY_OF_MONTH);
        int b = date.get(Calendar.MONTH);
        if(a==24&&b==11) return true;
        else return false;
    }
}

//    GregorianCalendar(2013, 11, 24) ➞ true
//
//        GregorianCalendar(2013, 0, 23) ➞ false
//
//        GregorianCalendar(3000, 11, 24) ➞ true

