//Say "Hello" Say "Bye"
//Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1, otherwise return "Bye" + name.
//
//Examples
//sayHelloBye("alon", 1) ➞ "Hello Alon"
//
//sayHelloBye("Tomi", 0) ➞ "Bye Tomi"
//
//sayHelloBye("jose", 0) ➞ "Bye Jose"
//Notes
//The name you return must be capitalized.
package sayhellosaybye;

public class SayHelloSayBye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(sayHelloBye("alon", 1));

    }

    public static String sayHelloBye(String name, int num) {

//        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
//		if (num == 1){
//			return "Hello " + name; 			
//		} else if (num == 0){
//			return "Bye " + name; 
//		}
//		return "";
//name = name.substring(0, 1).toUpperCase() + name.substring(1);
//    if(num == 0) {
//			return "Bye " + name;
//		} else {
//			return "Hello " + name;
//		}
 name = name.substring(0,1).toUpperCase() + name.substring(1);
		return num == 1 ? "Hello " + name : "Bye " + name;
    }

}
