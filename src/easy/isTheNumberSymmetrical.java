package easy;

public class isTheNumberSymmetrical {
    public static void main(String[] args) {
        System.out.println(isSymmetrical(11211));
    }
    public static boolean isSymmetrical(int num) {
        int reversed = 0;
int num1 = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(num1 == reversed){
            return true;
        }
        else{
            return false;
        }
    }
}

//    isSymmetrical(7227) ➞ true
//
//        isSymmetrical(12567) ➞ false
//
//        isSymmetrical(44444444) ➞ true
//
//        isSymmetrical(9939) ➞ false
//
//        isSymmetrical(1112111) ➞ true
