package com.example.demo;

public interface java8interface {
    default void defaultMethod(){
       // staticMethod();
        System.out.println("defaultMethod ");
    }
    public static void staticMethod(){

        System.out.println("----staticMethod ");
    }
    void publicMethod();




}
