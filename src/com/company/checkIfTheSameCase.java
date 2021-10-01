public class checkIfTheSameCase {
    public static void main(String[] args) {
        
        System.out.println(sameCase("Hello"));
    }
    
   public static boolean sameCase(String str) {
      //malki
		boolean hasUppercase = str.equals(str.toLowerCase());
      //golemi
      boolean hasLowercase = str.equals(str.toUpperCase());

      if(hasUppercase)return true;
     if(hasLowercase)return true;
      return false;
	  }
}

//sameCase("hello") ➞ true
//sameCase("HELLO") ➞ true
//sameCase("Hello") ➞ false
//sameCase("ketcHUp") ➞ false

