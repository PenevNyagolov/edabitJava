//Most Left Digit
//Write a function that takes a string as an argument and returns the left most digit in the string.
//
//Examples
//leftDigit("TrAdE2W1n95!") ➞ 2
//
//leftDigit("V3r1ta$") ➞ 3
//
//leftDigit("U//DertHe1nflu3nC3") ➞ 1
//
//leftDigit("J@v@5cR1PT") ➞ 5
//Notes
//Each string will have at least two numbers.
package mostleftdigit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostLeftDigit {

    public static void main(String[] args) {
        System.out.println(leftDigit("0nSlaUgh7*d3atH"));
        // Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
        // Matcher m = p.matcher("U//DertHe1nflu3nC3");
       // String a = "TrAdE2W1n95!";
       // a = a.replaceAll("\\D+", "");
//int b = Integer.parseInt(a);
       // System.out.println(a.substring(0, 1));
        // if an occurrence if a pattern was found in a given string...
        // if (m.find()) {
        //    System.out.println(m.group()); // second matched digits
        // }
    }

    public static int leftDigit(String str) {
       return Integer.valueOf(str.replaceAll("\\D+","").substring(0,1));
    }
}
//Pattern pattern = Pattern.compile("[0-9]");
//		Matcher matcher = pattern.matcher(str);
//
//		if (matcher.find()) {
//			 return Integer.parseInt(matcher.group(0));
//		}
//		
//		return 0;

//for (int i = 0; i < str.length(); i++) {
//			if (Character.isDigit(str.charAt(i))) {return (int)str.charAt(i) - 48;}
//		}
//		return -1;