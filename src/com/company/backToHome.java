package com.company;

public class backToHome {
    public static void main(String[] args) {

        System.out.println(backToHome("NENESSWW"));
    }
    public static boolean backToHome(String direction)
    {

        int w = 0, s = 0, n = 0, e = 0;
        for (int i = 0; i < direction.length(); i++)
            if (direction.charAt(i) == 'N') n++;
            else if(direction.charAt(i) == 'E') e++;
            else if(direction.charAt(i) == 'W') w++;
            else s++;
        return n == s && w == e;
    }
}
