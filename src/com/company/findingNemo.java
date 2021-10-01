import java.util.Arrays;
public class findingNemo {  
    public static void main(String[] args) {
        
        System.out.println(findNemo("Is it Nemos, Nemona, Nemoor or Garfield?"));
    }
  public static String findNemo(String sentence) {
          String []str=sentence.split(" ");
		   for(int i=0;i<str.length;i++){
			   if(str[i].equals("Nemo")){
			   	return "I found Nemo at "+(i+1)+"!";
			   }
		   }
		   return "I can't find Nemo :(";

  }
}

//findNemo("I am finding Nemo !") ➞ "I found Nemo at 4!"

//findNemo("Nemo is me") ➞ "I found Nemo at 1!"

//findNemo("I Nemo am") ➞ "I found Nemo at 2!"