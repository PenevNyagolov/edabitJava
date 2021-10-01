public class dateFormat {
    public static void main(String[] args) {
        
        System.out.println(formatDate("12/31/2019"));
    }
   public static String formatDate(String date) {
      String a = date.substring(6);
      String b = date.substring(3,5);
		return a + b + date.substring(0,2);
     // String part[] = date.split("/");
		//return part[2]+part[1]+part[0];
	} 
   
}

//formatDate("11/12/2019") ➞ "20191211"
//formatDate("12/31/2019") ➞ "20193112"
//formatDate("01/15/2019") ➞ "20191501"