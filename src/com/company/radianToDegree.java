public class radianToDegree {
    public static void main(String[] args) {
        
        System.out.println(toDegree(Math.PI));
    }
 	public static double toDegree(double num) {
		return num * 180 / Math.PI;
	}
}

//toDegree(Math.PI) ➞ 180
//toDegree(Math.PI/2) ➞ 90
//toDegree(Math.PI/4) ➞ 45