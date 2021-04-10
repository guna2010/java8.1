package com.example.demo;

import java.util.function.Function;

public class FunctionInteModifiyOutside {
    public static void main(String arg[]) {
int x=10;
        INCRE i=(m)->{
            System.out.println(" inside lamda x="+x);
            return m+1;

        };
      int c=  i.increment(1);
        System.out.println(" c="+c);


    }


}
interface INCRE{
    int increment(int a);
}

