package com.example.demo;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptinalTestNull {
    public static void main(String arg[]){
        Optional<String>  v=  getName(null);
      //  System.out.println("v="+v);
       String elsee= v.orElse(null);
       // System.out.println("elsee="+elsee);
        Consumer c=(i)->{
            System.out.println(" consumer called"+i);
        };

        Supplier<String> sup=()->{
            return new String(" Supp value");
        };

        v.ifPresent(c);
      String fromSupp=  v.orElseGet(sup);
        System.out.println("fromSupp "+fromSupp);

      String newString=  v.orElse("Sankar");
        System.out.println("newString "+newString);

    }
   static Optional<String> getName(String s){
        if(s==null){
            Optional<String> value=Optional.empty();
            return value;
        }
        else{
            Optional<String> value=Optional.of("Guna vslue");
            return value;
        }
    }


}
