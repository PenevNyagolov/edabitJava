public class reverceAndCapitalize {
    public static void main(String[] args) {
        
        System.out.println(reverseCapitalize("abc"));
    }
  public static String reverseCapitalize(String str) {
		String result="";
      for(int i = str.length()-1; i >= 0; i--) {
          result = result + str.charAt(i);
      }
         return result.toUpperCase();
	}
   
}

//reverseCapitalize("abc") ➞ "CBA"
//reverseCapitalize("hellothere") ➞ "EREHTOLLEH"
//reverseCapitalize("input") ➞ "TUPNI"
