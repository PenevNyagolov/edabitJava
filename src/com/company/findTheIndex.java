package opit;

public class findTheIndex {
    public static void main(String[] args) {

        System.out.println(findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh"));
    }
    public static int findIndex(String[] arr,String str) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str){
                a += i;
            }
        }
        return  a;
    }
}

//findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") ➞ 2
//findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") ➞ 1
//findIndex(new String[]{"a", "g", "y", "d"}, "d") ➞ 3
//findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple") ➞ 0
