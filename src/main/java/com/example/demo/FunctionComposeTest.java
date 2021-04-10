package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
public class FunctionComposeTest {
    public static void main(String args[])
    {

        Function<String, Integer> f = Integer::new;
        Integer i = f.apply("100");

        // Function which takes stringin a number and
        // returns half of it

        Function<Integer, String> half = a -> {
            System.out.println(" First ");
            if(a==10)
              return "Guna"+a;
            else{
                return "Guna"+"Sankar";
            }
        };


        // However treble the value given to half function
        half = half.compose(   a -> {   System.out.println(" second "); return a ;});

        // apply the function to get the result
        System.out.println(half.apply(1));
    }
}
