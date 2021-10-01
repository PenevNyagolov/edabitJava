package easy;

public class atmPinCodeValidation {
    public static void main(String[] args) {
        String s="123456";
        char arr[]=s.toCharArray();
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {

                    System.out.println("Data at [" + i + "]=" + arr[i]);

            }
        }else {
            System.out.println("vxcvxvx");
        }
        System.out.println(validatePIN("a234"));
    }
   public static boolean validatePIN(String s) {
       if(s.isEmpty()){
           return false;
       }else{
           char arr[]=s.toCharArray();
           if (arr.length % 2 == 0) {
               for (int i = 0; i < arr.length; i++){
                   if (!Character.isDigit(arr[i])){
                       return false;
                   }
               }
               return true;
           }else {
               return false;
           }
       }
   }
}
//validatePIN("1234") ➞ true

//validatePIN("12345") ➞ false

//validatePIN("a234") ➞ false

//validatePIN("") ➞ false