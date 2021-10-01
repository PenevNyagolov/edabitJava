package easy;

import java.util.Arrays;

public class getTheFileExtension {
    public static void main(String[] args) {
        String[] a = {"ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"};
            System.out.println(Arrays.toString(getExtension(a)));
        }
        public static String[] getExtension (String[]arr) {
            String[] newArr = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i].split("\\.")[1];
            }
            return newArr;
        }
}

//    getExtension(["code.html", "code.css"])
//➞ ["html", "css"]
//
//        getExtension(["project1.jpg", "project1.pdf", "project1.mp3"])
//        ➞ ["jpg", "pdf", "mp3"]
//
//        getExtension(["ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"])
//        ➞ ["rb", "cpp", "py", "js"]
