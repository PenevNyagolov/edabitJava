//Create a function that returns the number of hashes and pluses in a string.
//
//Examples
//hashPlusCount("###+") ➞ [3, 1]
//
//hashPlusCount("##+++#") ➞ [3, 3]
//
//hashPlusCount("#+++#+#++#") ➞ [4, 6]
//
//hashPlusCount("") ➞ [0, 0]
//Notes
//Return [0, 0] for an empty string.
//Return in the order of [hashes, pluses].

package hashespluses;

/**
 *
 * @author tihomir
 */
public class HashesPluses {

    
    public static void main(String[] args) {
        System.out.println(hashPlusCount("###+"));
    }
    public static int[] hashPlusCount(String s) {
		return new int[] {s.replace("+","").length(),s.replace("#","").length()};
	}
}
//
//int [] hashAndPlus = {0 , 0};
//		
//		for(int i = 0; i < s.length(); i++){
//			if(s.charAt(i) == '#'){
//				hashAndPlus[0] += 1;
//			}
//			else if(s.charAt(i) == '+'){
//				hashAndPlus[1] += 1;
//			}	
//		}
//		return hashAndPlus;
//===========================================
//int hashCount = 0;
//		int plusCount = 0;
//		for(int i = 0; i < s.length(); i++){
//			if(s.charAt(i) == '#'){
//				hashCount++;
//			} else if(s.charAt(i) == '+'){
//				plusCount++;
//			}
//		}
//		return new int [] {hashCount, plusCount};
//===========================================================
//int[] result = new int[]{0,0};
//		for(int i=0;i<s.length();i++){
//			if(s.charAt(i) =='#') result[0]++;
//			else if(s.charAt(i) =='+') result[1]++;
//		}
//		return result;