package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting18 {

    public static void main(String arg[]) {
        List<Emp> list = new ArrayList();
        List templist = new ArrayList();
        Emp e1 = new Emp(10, "guna", 46, "IT");
        Emp e2 = new Emp(100, "Suku", 21, "IT");
        Emp e3 = new Emp(13, "Raja", 41, "IT");
        Comparator<Emp> compareById_2 = (Emp o1, Emp o2) -> {

                return  o1.getId().compareTo( o2.getId() );};
        list.add(e1);
        list.add(e2);
        list.add(e3);

      list.stream().sorted(compareById_2).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println(" ==================");
        templist.forEach(System.out::println);
    }
}
class comImpl implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Emp e1=(Emp)o1;
        Emp e2=(Emp)o2;
        return e1.getId().compareTo(e2.getId());
    }
}