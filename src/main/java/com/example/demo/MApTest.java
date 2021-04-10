package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MApTest {
    public static void main(String arg[]){
        HashMap map=new HashMap();
        ArrayList list=new ArrayList();
        list.add("g");
        list.add("v");
        list.add("q");
        list.add("z");
        Function f=x->{
            return x;};

        ArrayList list1= (ArrayList) list.stream().map(x->x+"1").collect(Collectors.toList());


        //System.out.println(" List1="+list1);
        Consumer c=System.out::println;
        //Function fff=System.out::println;
        list1.forEach(c);
        list1.stream().forEach(c);

    }

}
