public class brrrrrp {
    public static void main(String[] args) {
        
        System.out.println(longBurp(3));
    }
    public static String longBurp(int n) {
		 String text = "Burp"; 
       char a = 'r';
        String ans = "";
       for (int i = 0; i < text.length(); i++) {
             char z = text.charAt(i);
             if(z == a) {
                 for(int j = 0;j < n;j++){
                   ans += z;
                 }
             }
          }
          return "Bu" + ans + "p";
  }
   
}

//longBurp(3) ➞ "Burrrp"
//longBurp(5) ➞ "Burrrrrp"
//longBurp(9) ➞ "Burrrrrrrrrp"