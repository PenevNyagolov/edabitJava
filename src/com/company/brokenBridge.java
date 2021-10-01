package opit;

public class brokenBridge {
    public static void main(String[] args) {

        System.out.println(isSafeBridge("######"));
    }
    public static boolean isSafeBridge(String bridge) {

        if (bridge.contains(" ")){
            return false;
        }else {
            return  true;
        }
    }
}

//        isSafeBridge("####") ➞ true
//        isSafeBridge("## ####") ➞ false
//        isSafeBridge("#") ➞ true
