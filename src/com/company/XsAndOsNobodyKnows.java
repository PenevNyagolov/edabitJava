package com.company;

import java.util.Locale;

public class XsAndOsNobodyKnows {
    public static void main(String[] args) {
        System.out.println(getXO("ooXx"));
    }
    public static boolean getXO (String str) {

        boolean bool=true;
        str=str.toLowerCase();
        int x=0,o=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='x')
                x++;
            else if(c=='o')
                o++;
        }if(x==o)
            bool=true;
        else
            bool=false;

        return bool;

    }
}
