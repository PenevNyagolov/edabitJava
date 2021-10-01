public class findTheSmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] a = {34, 15, 88, 2};
        System.out.println(findSmallestInt(a));
    }
    
    public static int findSmallestInt(int[] args) {
			int a = args[0];
      for (int i = 0; i < args.length; i++) {
         if (args[i] < a) {
             a = args[i];
         }
       }
			return a;
    }
}

//findSmallestNum([34, 15, 88, 2]) ➞ 2
//findSmallestNum([34, -345, -1, 100]) ➞ -345
//findSmallestNum([7, 7, 7]) ➞ 7
