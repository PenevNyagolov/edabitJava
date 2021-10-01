public class checkIfAstringContainsOnlyIdeticalCharacters{
   
    public static void main(String[] args) {
        
        System.out.println(isIdentical("aaaaaa"));
    }
  public static boolean isIdentical(String str) {
		char c1 = str.charAt(0);
      for(int i = 1;i < str.length();i++) {
          char temp = str.charAt(i);
          if(c1 != temp) {
         //if chars does NOT match, 
         //just return false from here itself,
         //there is no need to verify other chars
         return false;
      }
  }
  //As it did NOT return from above if (inside for)
  //it means, all chars matched, so return true
  return true;
  }
   
}

//isIdentical("aaaaaa") ➞ true

//isIdentical("aabaaa") ➞ false

//isIdentical("ccccca") ➞ false

//("kk") ➞ true