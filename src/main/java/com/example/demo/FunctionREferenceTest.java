package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionREferenceTest {
    public static void main(String arg[]){
        FunctionsHaving fun=new FunctionsHaving();
        Consumer consumer=fun::returnVoid;
        consumer.accept(10);
       Function<String, Integer> f =String::length;
        Function<String, Integer> nameMappingFunction = String::length;

        nameMappingFunction=String::hashCode;

    }
}
class FunctionsHaving{
    Integer returnInt(){
        return 10;
    }
  public  void  returnVoid(){
        System.out.println(" returnVoid");

    }

    public Integer returnVoid(Object o) {
        System.out.println(" Object returnVoid");
        return 10;
    }
}
