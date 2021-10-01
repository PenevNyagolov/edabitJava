package easy;

public class fruitJuices {
    public static void main(String[] args) {
        System.out.println(getDrinkID("apple rety", "500ml"));
    }
    public static String getDrinkID(String flavor, String ml) {
        String[] c = flavor.split("\\s");
        String a ="";
        for (int i = 0; i < c.length; i++) {
            a += c[i].substring(0,3);
        }
//       String a = flavor.substring(0,3);
       String b = ml.replaceAll("[^0-9]","");
       return a.toUpperCase() + b;
//       return a.toUpperCase() + b.toUpperCase();
    }
}

//    getDrinkID("apple", "500ml") ➞ "APP500"
//
//        getDrinkID("pineapple", "45ml") ➞ "PIN45"
//
//        getDrinkID("passion fruit", "750ml") ➞ "PASFRU750"
