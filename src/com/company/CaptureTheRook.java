//Capture the Rook
//Write a function that returns true if two rooks can attack each other, and false otherwise.
//
//Examples
//canCapture(["A8", "E8"]) ➞ true
//
//canCapture(["A1", "B2"]) ➞ false
//
//canCapture(["H4", "H3"]) ➞ true
//
//canCapture(["F5", "C8"]) ➞ false
//Notes
//Assume no blocking pieces.
//Two rooks can attack each other if they share the same row (letter) or column (number).
package capturetherook;
import java.util.Arrays;

public class CaptureTheRook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] rooks = {"F5","C8"};
        //System.out.println(arr);
        System.out.println(canCapture(rooks));
    }
    public static boolean canCapture(String[] rooks) {
        String myPos = rooks[0];
        String yoPos = rooks[1];
        if (myPos.charAt(0) == yoPos.charAt(0) || myPos.charAt(1) == yoPos.charAt(1)) {
            return true;
        } else {
            return false;
        }
    }

}
