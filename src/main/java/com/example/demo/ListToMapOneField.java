package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMapOneField {
    public static void main(String arg[]){
        ArrayList<Emp> list=new ArrayList();
        ArrayList<Emp> templist=new ArrayList();
        list.add(new Emp(10,"guna",11,"IT"));
        list.add(new Emp(11,"guna",12,"IT"));
        list.add(new Emp(13,"sankar",22,"Admin"));

     //   list.add(new Emp(11,"sankar",22,"BSA"));
        list.add(new Emp(199,"sankar",22,"BSA"));

      //  e.g
        Function<Emp,Map> f=(e1)->{
            Map m=new HashMap<>();
            m.put(e1.getDept(),e1.getId());

            return m;
        };

      List s=  list.stream().map(f).collect(Collectors.toList());

Map l2m=list.stream().collect(Collectors.toMap(Emp::getDept,Emp::getId,(oldValue, newValue) -> newValue));
        l2m=list.stream().collect(Collectors.toMap(Emp::getId,e->e));
      //  System.out.println("listofmap="+s);
      System.out.println("l2m="+l2m);
    }

}
