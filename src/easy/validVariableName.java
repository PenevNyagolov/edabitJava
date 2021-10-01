package easy;

public class validVariableName {
    public static void main(String[] args) {
//        String a = "ala bala";
//        char[] b = a.toCharArray();
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(Character.isSpaceChar(b[i]));
//        }
//        boolean b = Character.isSpaceChar(a.charAcot(4));
//        System.out.println(b);
        System.out.println(variableValid("count spaces"));
    }
    public static boolean variableValid(String variable) {
//        boolean flag = false;
//        char[] chr = variable.toCharArray();
//        for (int i = 0; i < chr.length; i++) {
//
//            if(Character.isLetter(chr[0])){
//                return true;
//            }
//            if (Character.isDigit(chr[0])){
//                return false;
//            }
////            if (!Character.isSpaceChar(chr[i])){
////                flag = false;
////            }
//            if ((chr[i] == ' ') || (chr[i] =='\n') || (chr[i] == '\t')){
//                return true;
//            }
//        }
//        return flag;
        char c = variable.charAt(0);
        if(Character.isDigit(c))
            return false;
        else if(variable.contains(" "))
            return false;
        return true;
    }
}

//    variableValid("result") ➞ true
//
//        variableValid("odd_nums") ➞ true
//
//        variableValid("2TimesN") ➞ false
