package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class ListToMap {
    public static void main(String arg[]){
        ArrayList<Emp> list=new ArrayList();
        ArrayList<Emp> templist=new ArrayList();
        list.add(new Emp(10,"guna",11,"IT"));
        list.add(new Emp(11,"sankar",22,"Admin"));
        list.add(new Emp(11,"sankar",22,"Admin"));
        list.add(new Emp(11,"sankar",22,"BSA"));
        list.add(new Emp(11,"sankar",22,"IT"));
        System.out.println(" list"+list);
        BiConsumer<String,List> f=(s, l)->{
            System.out.println("dept="+s+" count="+l.size());
            l.stream().forEach(e->System.out.println(e));

        };

     Map map= new HashMap();


       Map groupMap= list.stream().collect(Collectors.groupingBy(r -> (String) (r.getDept())));

       System.out.println("groupMap======== "+groupMap);
        System.out.println("\n\n groupMap======== ");
        groupMap.forEach(f);
        System.out.println("oo="+groupMap);

        // put dep and count

              //  .stream().map(l -> l.stream().allMatch(empDeptPredicate))
             //   .collect(Collectors.partitioningBy(k -> k, Collectors.counting()));

 // group by dept and count emp
        // select deptname,Count(*) from emp group by dept



    }
    
}




/*

   Function<Emp,Emp> femp=(e)->{
            return e;

        };
    Emp e1=new Emp(10,"guna",11,"uu");
        fId.apply(e1);
        Consumer c=System.out::println;
      Map map=  list.stream().
              collect(Collectors.toMap(
              e->{int x=10+e.id; ;return new Integer(x);}
              ,femp));
      System.out.println(" map="+map);

       list.stream().forEach(s->System.out.println(s.name));
 */
