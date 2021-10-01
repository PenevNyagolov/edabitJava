package easy;

import java.util.Arrays;

public class amplifyTheMultiplesOfFOUR {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(amplify(4)));
    }
    public static int[] amplify(int num) {
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = i+1;
            if (answer[i] % 4 == 0) {
                answer[i] = answer[i]	* 10;
            }
        }
        return answer;
    }
}
