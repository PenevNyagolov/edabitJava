package com.company;

public class jayAndSlientBobWeightConvertor {
    public static void main(String[] args) {

    }
    public static String jayAndBob(String w) {
        switch (w) {
            case ("half"):
                return "14 grams";
            case ("quarter"):
                return "7 grams";
            case ("eighth"):
                return "3.5 grams";
            default:
                return "1.75 grams";
        }
    }
}
