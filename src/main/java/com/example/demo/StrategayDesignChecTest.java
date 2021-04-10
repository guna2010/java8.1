package com.example.demo;

public class StrategayDesignChecTest {
    public static  void main(String arg[]){
        InterstCal InterstCal=new MoneyMarketInterst();
        StragyContext context=new StragyContext(InterstCal);
        int mmaa=context.getAppliedInterst();
        System.out.println(" applied mmaa="+mmaa);
        InterstCal=new FixedInterst();
        context=new StragyContext(InterstCal);
        int fixaa=context.getAppliedInterst();
        System.out.println(" applied fixaa="+fixaa);
    }

}
class StragyContext{
    InterstCal cal;
    StragyContext(InterstCal cal){
        this.cal=cal;
    }
    int getAppliedInterst(){
       int interst= cal.applyInterst();
       return interst;
    }


}
interface InterstCal{
    int applyInterst();
}
class MoneyMarketInterst implements InterstCal{

    @Override
    public int applyInterst() {

        return 1;
    }
}
class FixedInterst implements InterstCal{

    @Override
    public int applyInterst() {

        return 2;
    }
}



