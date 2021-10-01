package easy;

public class lettersOnly {
    public static void main(String[] args) {
        System.out.println(lettersOnly("R!=:~0o0./c&}9k`60=y"));
    }
    public static String lettersOnly(String str) {
        String a = str.replaceAll("[^a-zA-Z]","");
        return a;
    }
}

//    lettersOnly("R!=:~0o0./c&}9k`60=y") ➞ "Rocky"
//
//        lettersOnly("^,]%4B|@56a![0{2m>b1&4i4") ➞ "Bambi"
//
//        lettersOnly("^U)6$22>8p).") ➞ "Up"
