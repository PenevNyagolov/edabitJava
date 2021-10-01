package addconsecutivelistnumber;

import java.util.Arrays;

public class ScoringSystem {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(calculateScores("AABCCC")));
	}

	public static int[] calculateScores(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				a++;
			} else if (str.charAt(i) == 'B') {
				b++;
			} else {
				c++;
			}
		}
		int[] erg = {a, b, c};
		return erg;
	}
}
