package easy;

public class getTheFileName {
    public static void main(String[] args) {
        System.out.println(getFilename("C:/Projects/pil_tests/ascii/edabit.txt"));
    }
    public static String getFilename(String path) {
            String[] a = path.split("/");
            String b = "";
        for (String c : a){
            b = c;
        }
           return b;
    }
}

//    getFilename("C:/Projects/pil_tests/ascii/edabit.txt") ➞ "edabit.txt"
//
//        getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3") ➞ "Beethoven_5.mp3"
//
//        getFilename("ffprobe.exe") ➞ "ffprobe.exe"
