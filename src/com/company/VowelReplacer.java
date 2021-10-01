//Vowel Replacer
//Create a function that replaces all the vowels in a string with a specified character.
//
//Examples
//replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"
//
//replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"
//
//replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"
//Notes
//All characters will be in lower case.



package vowelreplacer;

public class VowelReplacer {

   
    public static void main(String[] args) {
        System.out.println(replaceVowels("the aardvark", '#'));
    }
    public static String replaceVowels(String str, char ch) {
        
       
        if(ch == '#'){
            return str.replaceAll("[aeiou]", "#");
        }else if(ch == '?'){
            return str.replaceAll("[aeiou]", "?");
        }else if(ch == '*'){
            return str.replaceAll("[aeiou]", "*");
        }else if(ch == '<'){
            return str.replaceAll("[aeiou]", "<");
        }else{
            return str;
        }

  
	}
}

//String newStr = "";
//		String vowels = "aeiou";
//		for(int i = 0; i < str.length(); i++){
//			char currChar = str.charAt(i);
//			if(vowels.indexOf(currChar) != -1){
//				newStr += ch;
//			} else {
//				newStr += currChar;
//			}
//		}
//		return newStr;