package com.example.demo;

public class EnumTest {
    public static void main(String arg[]){
        System.out.println(" Color="+Color.values().length);
        System.out.println(" Color="+Color.MONDAY);
    }

}
 enum Color{
    SUNDAY,
     MONDAY;
     public Color getValue(){
         return Color.MONDAY;
     }

}

