package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MakeCapStringinListLamda {

    public static void main(String[] args) {
        MakeCps caps=(s)->{

            return s.toUpperCase();
        };
        String m="gggg";
      String cc=  caps.makecap(m);
      System.out.println(" cc"+cc);
        ArrayList<String> list=new ArrayList();
        list.add("gggg");
        list.add("rTy");
List newList=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);
    }
}
@FunctionalInterface
interface MakeCps{
    String makecap(String s);
}
