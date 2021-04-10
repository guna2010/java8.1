package com.example.demo;

public class DoubleDispatchDemo {
    public static void main(String arg[]){
        MoneyACC m=new MoneyACC();
        ACC a=new ACC();

        teest(a);
        a=new MoneyACC();
        teest(a);


    }

    static void teest(ACC a){
        System.out.println(" ACC");
        a.print();
    }
    static void teest(MoneyACC a){
        System.out.println(" MOMEYACC");
        a.print();
    }


}
class ACC{
    int print(){
        return 1;
    }

}


class MoneyACC extends ACC{
    int print(){
        return 2;
    }

}

class FixedACC extends ACC{
    int print(){
        return 3;
    }

}



