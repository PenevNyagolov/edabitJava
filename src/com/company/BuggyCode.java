package opit;

public class BuggyCode {

	public static void main(String[] args) {
		
		System.out.println(greeting("Math"));

	}
	public static String greeting(String name) {
		//return "Hello, " + name + "!";  
	  if(name == "Mubashir") {
    		return "Hello, my Love!";
  		}
		return "Hello, " + name + "!"; 
	}
}
