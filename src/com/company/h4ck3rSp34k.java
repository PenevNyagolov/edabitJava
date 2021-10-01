package opit;

public class h4ck3rSp34k {
    public static void main(String[] args) {

        System.out.println(hackerSpeak("become a coder"));
    }
    public static String hackerSpeak(String str) {

        String a = str.replaceAll("a","4");
        String b = a.replaceAll("e","3");
        String c = b.replaceAll("i","1");
        String d = c.replaceAll("o","0");
        String e = d.replaceAll("s","5");
        return e;
    }
}

//hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"
//hackerSpeak("programming is fun") ➞ "pr0gr4mm1ng 15 fun"
//hackerSpeak("become a coder") ➞ "b3c0m3 4 c0d3r"
