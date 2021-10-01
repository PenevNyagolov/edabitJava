package easy;

public class capitalizeTheFirstLetterOfEachWord {
    public static void main(String[] args) {
        System.out.println(makeTitle("This is a title"));
    }
    public static String makeTitle(String s) {
        String result = "";
        String[] splitString = s.split(" ");
        for(String target : splitString){
            result += Character.toUpperCase(target.charAt(0))
                    + target.substring(1) + " ";
        }
        return result.trim();
    }
}

//    makeTitle("This is a title") ➞ "This Is A Title"
//
//        makeTitle("capitalize every word") ➞ "Capitalize Every Word"
//
//        makeTitle("I Like Pizza") ➞ "I Like Pizza"
//
//        makeTitle("PIZZA PIZZA PIZZA") ➞ "PIZZA PIZZA PIZZA"
