package com.example.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class DotdotArg {
    public static void main(String arg[]){
        Hashtable map=new Hashtable();

       // map.put("XX",null);
      //  map.put(null,"Default1");
        System.out.println("Null key=="+map.get(null));


        method("a","B");
    }
    private static void method(Object... arg){
        System.out.println(" method="+arg[1]);
    }


}
