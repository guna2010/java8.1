package com.example.demo;

import java.util.function.Consumer;

public class Interface2SameMethod {
    public static void main(String ar[]){
        System.out.println(" xx=");
        Imp p=new Imp();
        p.commonMethod();

    }

}
class Imp implements A,B{
    public void commonMethod() {
        System.out.println(" impl=");
      A.super.commonMethod();
    }
}

interface A{
    public default void commonMethod(){
        System.out.println(" a=");
    }
}

interface B{
    public default void commonMethod(){
        System.out.println(" B=");
    }
}