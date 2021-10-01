package opit;

public class amazingEdabit {
    public static void main(String[] args) {
        System.out.println(amazingEdabit("edabit is amazing."));
    }
    public static String amazingEdabit(String str) {
        if(str.contains("edabit")){
            return str;
        }else{
            return str.replace("is","is not");
        }
    }
}

//amazingEdabit("edabit is amazing.") ➞ "edabit is amazing."
//amazingEdabit("Mubashir is amazing.") ➞ "Mubashir is not amazing."
//amazingEdabit("Infinity is amazing.") ➞ "Infinity is not amazing."
