package com.example.demo;

import java.util.Arrays;

public class StringToCharArr {
    public static void main(String ar[]){
        String name="string";
        char[] a1=name.toCharArray();
        Arrays.sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);


        }
       // System.out.println(new String(a1));
    }


}
