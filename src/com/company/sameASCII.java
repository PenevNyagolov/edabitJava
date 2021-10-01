package com.company;

public class sameASCII {
    public static void main(String[] args) {
       String a = "EDABIT";
       int firstSum = 0;
       char arr[] = a.toCharArray();
       for(int i = 0;i < arr.length;i++){
            //System.out.println("Data at ["+i+"]="+arr[i]);
            int c = (int)arr[i];
            firstSum += c;
       }
         System.out.println(firstSum);
       
        System.out.println(sameAscii("EdAbIt", "EDABIT"));
    }
    public static boolean sameAscii(String a, String b) {
       int firstSum = 0;
       char[] arr = a.toCharArray();
       for(int i = 0;i < arr.length;i++){
            //System.out.println("Data at ["+i+"]="+arr[i]);
            int c = (int)arr[i];
            firstSum += c;
       }
       
       int secondSum = 0;
       char[] arrChar = b.toCharArray();
       for(int i = 0;i < arrChar.length;i++){
            //System.out.println("Data at ["+i+"]="+arr[i]);
            int c = (int)arrChar[i];
            secondSum += c;
       }
       
       if(firstSum == secondSum){
          return true;
       }else{
          return false; 
       }
       

    }
}
