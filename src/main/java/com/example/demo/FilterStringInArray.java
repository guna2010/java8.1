package com.example.demo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterStringInArray {
    public static void main(String arg[]){
        ArrayList<String> names=new ArrayList();
        names.add("Saltz");
        names.add("Beau");
        ArrayList list=new ArrayList();
         names.stream().filter(s-> s.contains("e")).collect(Collectors.toList());

       list.forEach(System.out::println);
    }

}
