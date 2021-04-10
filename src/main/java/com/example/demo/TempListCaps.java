package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TempListCaps {
    public static void main(String arg[]){
        List<String> list=new ArrayList<>();
        list.add("guna");
        list.add("Sankar");
        list.add("Sankar");
    Set s=  list.stream().collect(Collectors.toSet());
    System.out.println(" Set="+s);
    }

}
