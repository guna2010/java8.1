package com.example.demo;

import java.util.ArrayList;

public class VisitorExample {
    public static void main(String arg[]){
        Vistor cal=new ShoppingCardPaymentCal();
        cal.visit(cal);

    }

}

class Vistor{

    int visit(Vistor book){
        return 1;
    }

}


class ShoppingCardPaymentCal extends Vistor {
    ArrayList<Item> list=new ArrayList();


    int visit(Vistor v){
        int sum=0;
        for(Item i:list){
         int x=   i.accept();
         int y=   v.visit(this);
         sum=x+y;
        }
        System.out.println(" sum="+sum);
        return  sum;

    }
    private void setlist(){
        list.add(new Book());
    }


}

interface Item {
     int accept( );


}
class Book implements Item {
    @Override
    public int accept() {
        return 1;
    }
}


