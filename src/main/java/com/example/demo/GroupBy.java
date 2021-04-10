package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class GroupBy {
    //   Map<City, Set<String>> namesByCity
    //         = people.stream().collect(groupingBy(Person::getCity,
    //                                              mapping(Person::getLastName, toSet())));

    public static void main(String arg[]){


        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(10,"guna",11,"IT"));
        list.add(new Employee(11,"sankar",22,"Admin"));
        list.add(new Employee(11,"sankar",22,"Admin"));
        list.add(new Employee(11,"sankar",22,"BSA"));
        list.add(new Employee(11,"sankar",22,"IT"));
       List DEptName= list.stream().map(x->x.getDept()).collect(Collectors.toList());

      // Map<Object , List<Employee>> map=list.stream().collect(Collectors.groupingBy(s->s.getDept()));

    }

}
