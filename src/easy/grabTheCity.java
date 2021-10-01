package easy;

import java.util.Arrays;

public class grabTheCity {
    public static void main(String[] args) {
        String a = "[Duration: 7 hours] Tour of the Maritimes [Prince Edward Island]";
        System.out.println(a.lastIndexOf("["));
        System.out.println(grabCity("[Duration: 7 hours] Tour of the Maritimes [Prince Edward Island]"));
    }
    public static String grabCity(String str) {
        int a = str.lastIndexOf("[");
        return str.substring(a).replaceAll("[^\\w\\s-]","");

    }
}

//    grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
//
//        grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
//
//        grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞ "Kyoto"

