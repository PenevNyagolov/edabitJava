public class giveMeTheEvenNumber {
    public static void main(String[] args) {
        System.out.println(sumEvenNumsInRange(51,150));
    }
 	public static int sumEvenNumsInRange(int start, int stop) {
		int sum = 0;
      for(int i = start;i <= stop;i++){
         if(i % 2 == 0){
            sum += i;
          }
      }
      return sum;
  }
}


//sumEvenNumsInRange(10, 20) ➞ 90
// 10, 12, 14, 16, 18, 20
//sumEvenNumsInRange(51, 150) ➞ 5050
//sumEvenNumsInRange(63, 97) ➞ 1360