public class hittingTheJackpot {
    public static void main(String[] args) {
        String[] a = {"SS", "SS", "SS", "SS"};
        System.out.println(testJackpot(a));
    }
   public static boolean testJackpot(String[] result) {
		boolean test = true;
      for(int i = 1;i < result.length;i++){
      
          if(result[i] != result[0]){
             test = false;
            }
      }
      return test;
	} 
}

//testJackpot(["@", "@", "@", "@"]) ➞ true
//testJackpot(["abc", "abc", "abc", "abc"]) ➞ true
//testJackpot(["SS", "SS", "SS", "SS"]) ➞ true
//testJackpot(["&&", "&", "&&&", "&&&&"]) ➞ false
//testJackpot(["SS", "SS", "SS", "Ss"]) ➞ false

