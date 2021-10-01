package opit;

import java.util.Locale;

public class howManyDareThere {
    public static void main(String[] args) {

        System.out.println(countDs("My friend Dylan got distracted in school."));
    }
    public static int countDs(String s) {
        String str = s.toLowerCase();
        char someChar = 'd';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }
}

//countDs("My friend Dylan got distracted in school.") ➞ 4
//countDs("Debris was scattered all over the yard.") ➞ 3
//countDs("The rodents hibernated in their den.") ➞ 3
