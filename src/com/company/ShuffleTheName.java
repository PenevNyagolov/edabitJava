//Shuffle the Name
//Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.
//
//Examples
//nameShuffle("Donald Trump") ➞ "Trump Donald"
//
//nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
//
//nameShuffle("Seymour Butts") ➞ "Butts Seymour"
//Notes
//There will be exactly one space between the first and last name
package shufflethename;

public class ShuffleTheName {

    public static void main(String[] args) {
         String s ="Donald Trump";  
         String[] names = s.split(" ");
         System.out.println(names[1]+" "+names[0]);
        
        System.out.println(nameShuffle("Donald Trump"));

    }

    public static String nameShuffle(String s) {
        int lastIndex = s.lastIndexOf(" ");

        String firstNames = s.substring(0, lastIndex);
        String lastName = s.substring(lastIndex + 1);
        return lastName + " " + firstNames;
    }
}
