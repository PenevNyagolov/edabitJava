package opit;

public class charactersInShapes {
    public static void main(String[] args) {
        String[] a = {"###","###","###"};
        System.out.println(countCharacters(a));
    }
    public static int countCharacters(String[] arr) {

        String a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a.length();
       // return String.join("", arr).length();
    }
}

//countCharacters(["###","###","###"]) ➞ 9
//countCharacters(["22222222","22222222",]) ➞ 16
//countCharacters(["------------------"]) ➞ 18
//countCharacters([]) ➞ 0
//countCharacters(["", ""]) ➞ 0
