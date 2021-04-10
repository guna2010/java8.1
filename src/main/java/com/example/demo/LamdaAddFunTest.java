package com.example.demo;

public class LamdaAddFunTest {
    public static void main(String arg[]) {
        AddInteface a = (x, y) -> {
            return x + y;
        };
        int x = a.add(10, 12);
        System.out.println(" total=" + x);


        AddInteface a1 = (x1, y1) -> {

            return x1 + y1+1;
        };
        int x1 = a1.add(10, 12);
        System.out.println(" total= x1=" + x1);
        test(  (q, r) -> {

            return q+ r;
        },x1,x);
    }
static void test(AddInteface in,int x,int y){
        System.out.println("inside test ");
        in.add(x,y);
}

}


 interface AddInteface
{
    int add(int a,int b);
}

