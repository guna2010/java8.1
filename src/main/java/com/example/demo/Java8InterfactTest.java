package com.example.demo;

 class Java8InterfactTest {
    public static void main(String[] args) {
        java8interface imp=new InterfaceImpl();
        java8interface.staticMethod();
        imp.defaultMethod();




    }
    }
class InterfaceImpl implements java8interface
{

    @Override
    public void publicMethod() {
        //staticMethod();
        System.out.println("--InterfaceImpl --publicMethod ");
    }
}
