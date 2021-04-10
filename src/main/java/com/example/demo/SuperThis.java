package com.example.demo;

public class SuperThis {


    public static void main(String arg[]){

        Base b=new Sub();
        //Base.Test t= b.new Test();
        b.meTest();

    }

}

class Base{


    Base(){

        this("GGG");

    }
    Base(String a){
          final int i=10;
        System.out.println("Base(String a) ");
    }
    public static void meTest(){
          final int mm=0;
        System.out.println(" base ");



    }


}
class Sub extends Base{
    Sub(){}
    Sub(String a){
    }
    public static void meTest() {
        final int mm = 0;
        System.out.println(" Sub ");
    }
}

