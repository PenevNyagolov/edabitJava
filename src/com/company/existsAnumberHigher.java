public class existsAnumberHigher {

	public static void main(String[] args) {
		
     int[] arr = {5, 3, 15, 22, 4};
		System.out.println(existsHigher(arr,213));

	}
	 	public static boolean existsHigher(int[] arr, int n) {
		 boolean a = false;
       for (int i = 0;i < arr.length;i++){
           if(arr[i] >= n){
              a = true;
              break;
           } 
       }
      return a;
 
	}
}