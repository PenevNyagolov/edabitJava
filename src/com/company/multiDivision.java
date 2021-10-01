public class multiDivision {
    public static void main(String[] args) {
        //System.out.println((int)Math.pow(69,12) / 3);
        System.out.println(abcmath(69, 12, 3));
    }
    
    public static boolean abcmath(int a, int b, int c) {
		int division = a * (int)Math.pow(2,b);
      boolean test = false;
      if(division % c == 0){
      return true;
      } 
      return test;
  }
}

//abcmath(42, 5, 10) ➞ false
// 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344
// 1344 is not divisible by 10
//abcmath(5, 2, 1) ➞ true
//abcmath(1, 2, 3) ➞ false