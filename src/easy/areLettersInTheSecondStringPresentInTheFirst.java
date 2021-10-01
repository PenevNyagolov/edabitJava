package easy;

public class areLettersInTheSecondStringPresentInTheFirst {
    public static void main(String[] args) {
        String[] s = {"parses", "parsecs"};

        System.out.println(letterCheck(s));
    }
    public static boolean letterCheck(String[] s) {
            String first = s[0].toLowerCase();
            String[] second = s[1].toLowerCase().split("");

            for (String c: second){
                if (!first.contains(c)) return false;
            }
            return true;

    }
}

//    letterCheck(["trances", "nectar"]) ➞ true
//
//        letterCheck(["compadres", "DRAPES"]) ➞ true
//
//        letterCheck(["parses", "parsecs"]) ➞ false
