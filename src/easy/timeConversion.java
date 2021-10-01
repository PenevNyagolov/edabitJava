package easy;

public class timeConversion {
    public static void main(String[] args) {
        int a = 5025 % 60;
        int b = (5025 / 60) % 60;
        double c = ((5025/60)/60)%60;
        System.out.println(c);
        System.out.println(digitalClock(1));
    }
    public static String digitalClock(int seconds) {
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int left = (seconds % 60);

        return String.format("%02d:%02d:%02d", hours, minutes, left);
    }
}

//    digitalClock(5025) ➞ "01:23:45"
// 5025 seconds is 1 hour, 23 mins, 45 secs.

//        digitalClock(61201) ➞ "17:00:01"
// No AM/PM. 24h format.

//        digitalClock(87000) ➞ "00:10:00"
// It's 00:10 next day.