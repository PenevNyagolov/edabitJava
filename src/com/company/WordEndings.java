//Word Endings
//Create a function that adds a string ending to each member in an array.
//
//Examples
//addEnding(["clever", "meek", "hurried", "nice"], "ly")
//➞ ["cleverly", "meekly", "hurriedly", "nicely"]
//
//addEnding(["new", "pander", "scoop"], "er")
//➞ ["newer", "panderer", "scooper"]
//
//addEnding(["bend", "sharpen", "mean"], "ing")
//➞ ["bending", "sharpening", "meaning"]

package wordendings;

/**
 *
 * @author tihomir
 */
public class WordEndings {

    public static void main(String[] args) {
        String[] arr = {"new", "pander", "scoop"};
        System.out.println(addEnding(arr,"er"));
    }
    public static String[] addEnding(String[] arr, String ending) {
		for (int i=0; i<arr.length; i++){
			arr[i] += ending; 
		}
		return arr;
	}
}
