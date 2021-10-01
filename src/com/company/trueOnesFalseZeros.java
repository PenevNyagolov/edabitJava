import java.util.Arrays;
public class trueOnesFalseZeros {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(integerBoolean("100101")));
    }
  public static boolean[] integerBoolean(String bits) {
  int len = bits.length();
		boolean[] arr = new boolean[len];
		for (int i = 0; i < bits.length(); i++) {
			if (bits.charAt(i) == '1') {
				arr[i]=true;
			} else {
				arr[i]=false;
			}
		}
		return arr;
	
  }
   
}

//integerBoolean("100101") ➞ [true, false, false, true, false, true]

//integerBoolean("10") ➞ [true, false]

//integerBoolean("001") ➞ [false, false, true]

