//Shapes With N Sides
//Create a function that takes a whole number as input and returns the shape with that number's amount of sides. Here are the expected outputs to get from these inputs.
//
//Inputs	Outputs
//1	"circle"
//2	"semi-circle"
//3	"triangle"
//4	"square"
//5	"pentagon"
//6	"hexagon"
//7	"heptagon"
//8	"octagon"
//9	"nonagon"
//10	"decagon"
//Examples
//nSidedShape(3) ➞ "triangle"
//
//nSidedShape(1) ➞ "circle"
//
//nSidedShape(9) ➞ "nonagon"
//Notes
//There won't be any tests with a number below 1 or greater than 10.
//Return the output in lowercase.
//The challenge is intended to be completed without conditionals (it would take too long)!
package shapeswithnsides;

/**
 *
 * @author tihomir
 */
public class ShapesWithNsides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nSidedShape(7));
    }

    public static String nSidedShape(int n) {
        String input = "";
        switch (n) {
            case 1:
                input = "circle";
                break;
            case 2:
                input = "semi-circle";
                break;
            case 3:
                input = "triangle";
                break;
            case 4:
                input = "square";
                break;
            case 5:
                input = "pentagon";
                break;
            case 6:
                input = "hexagon";
                break;
            case 7:
                input = "heptagon";
                break;
            case 8:
                input = "octagon";
                break;
            case 9:
                input = "nonagon";
                break;
            case 10:
                input = "decagon";
                break;
        }
        return input;

//        String[] str = {"circle", "semi-circle", "triangle", "square", "pentagon",
//            "hexagon", "heptagon", "octagon", "nonagon", "decagon"};
//        return str[n - 1];
//HashMap<Integer,String> shapes = new HashMap<Integer,String>();
//		shapes.put(1, "circle");
//		shapes.put(2, "semi-circle");
//		shapes.put(3,"triangle");
//		shapes.put(4,"square");
//		shapes.put(5, "pentagon");
//		shapes.put(6, "hexagon");
//		shapes.put(7, "heptagon");
//		shapes.put(8, "octagon");
//		shapes.put(9, "nonagon");
//		shapes.put(10, "decagon");
//		return shapes.get(n);
    }
}
