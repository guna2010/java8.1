package com.example.demo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public interface Practice {
    public static void main(String arg[]){
        ArrayList<Emp> list=new ArrayList();
        ArrayList<Emp> templist=new ArrayList();
        Emp e=new Emp(10,"guna",46,"IT");
        modifiy(e);
        System.out.println("After"+e);
        list.add(new Emp(10,"guna",46,"IT"));
        list.add(new Emp(13,"sankar",32,"Admin"));
        list.add(new Emp(11,"sankar",37,"BSA"));
        list.add(new Emp(11,"SS1",37,"BSA"));
        // group by dept
      Map s=  list.stream().collect(Collectors.groupingBy(Emp::getDept));
      System.out.println("s"+s);
    }
    static void modifiy(Emp e){
        e.setId(22222);
    }



}
