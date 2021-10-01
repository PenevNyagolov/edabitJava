package addconsecutivelistnumber;

import java.util.Arrays;

public class the3ProgrammersProblem {

	public static void main(String[] args) {
//		programmers(147, 33, 526) ➞ 493
//
//		programmers(33, 72, 74) ➞ 41
//
//		programmers(1, 5, 9) ➞ 8
		System.out.println(programmers(147, 33, 526));

	}

	public static int programmers(int one, int two, int three) {
		int arr[] = { one, two, three };
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		return max - min;
	}
}
//return Math.max(Math.max(one,two),three) - Math.min(Math.min(one,two),three);