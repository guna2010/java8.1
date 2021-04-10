package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayFindClosetNum {
    public static void main(String arg[]) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");

        //   myList.forEach( System.out::println);

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(" s==" + s);
        }
    }

}




