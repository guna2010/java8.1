package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CollectionMap {
    public static void main(String arg[]){
        ArrayList list=new ArrayList();
        list.add("xxx");
        list.add("ttt");
        list.add("qqq");
       List list1= (List) list.stream().map(s-> {return s+",";}).collect(Collectors.toList());
       list1.forEach(System.out::println);

        list1.forEach(System.out::println);

    }
}


