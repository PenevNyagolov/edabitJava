import java.util.*; 
public class generateCountdownOfNumberArray{
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(countdown(5)));
    }
  
  public static int[] countdown(int start) {
		
            int[] result = new int[start+1];
            for (int i = start ; i >= 0; i--) {
                result[start-i] = i;
            }
            return result;
	}
  
}

//countdown(5) ➞ [5, 4, 3, 2, 1, 0]

//countdown(1) ➞ [1, 0]

//countdown(0) ➞ [0]