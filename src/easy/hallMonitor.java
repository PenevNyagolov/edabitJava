package easy;

public class hallMonitor {
    public static void main(String[] args) {
        String a[] = {"sfsdfs","dfsdfsdf"};
        System.out.println(possiblePath(a));
    }
    public static boolean possiblePath(Object[] t) {
        for(int i = 0; i < t.length-1; i++) {
            if(t[i] instanceof Integer && !(t[i+1] instanceof String)) return false;
        }
        return true;
    }
}
