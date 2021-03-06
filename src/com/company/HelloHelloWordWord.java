//Hello; Hello World; World
//Write a function that takes an integer and:
//
//If the number is a multiple of 3, return "Hello".
//If the number is a multiple of 5, return "World".
//If the number is a multiple of both 3 and 5, return "Hello World".
//Examples
//helloWorld(3) ➞ "Hello"
//
//helloWorld(5) ➞ "World"
//
//helloWorld(15) ➞ "Hello World"
package hellohellowordword;

public class HelloHelloWordWord {
    
    public static void main(String[] args) {
        System.out.println(helloWorld(5));
    }

    public static String helloWorld(int num) {
        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "Hello World";
        } else if (num % 5 == 0) {
            return "World";
        }else if(num % 3 == 0){
            return "Hello";
        }else{
            return "NOT";
        }
        
    }
}
