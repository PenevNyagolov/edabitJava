public class similarBread {
    public static void main(String[] args) {
        String[] a = {"brown bread", "chicken", "brown bread"};
        String[] b = {"white bread", "chicken", "white bread"};
        System.out.println(hasSameBread(a,b));
    }
 	public static boolean hasSameBread(String[] a, String[] b) {
		if(a[0] == b[0] && a[2] == b[2]){
         return true;
      }
      return false;
	} 
}


//hasSameBread(
//["white bread", "lettuce", "white bread"],
// ["white bread", "tomato", "white bread"]
//) ➞ true

//hasSameBread(
//  ["brown bread", "chicken", "brown bread"],
//  ["white bread", "chicken", "white bread"]
//) ➞ false

//hasSameBread(
//  ["toast", "cheese", "toast"],
//  ["brown bread", "cheese", "toast"]
//) ➞ false