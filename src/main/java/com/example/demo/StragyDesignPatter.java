package com.example.demo;

public class StragyDesignPatter {
    public static void main(String arg[]){
        StatgeyContext context =new StatgeyContext(new FixedIncomeCal()) ;
        context.executeStratgey();
        StatgeyContext context2 =new StatgeyContext(new MoneMarket()) ;
    }

}
interface IntertestCal{
    int calInsterst();
}
class FixedIncomeCal implements IntertestCal{

    @Override
    public int calInsterst() {
        return 0;
    }
}

class MoneMarket implements IntertestCal{

    @Override
    public int calInsterst() {
        return 0;
    }
}
class StatgeyContext {
    IntertestCal fundType;
    StatgeyContext(IntertestCal fundType){
        this.fundType=fundType;
    }
    int executeStratgey(){
       return  fundType.calInsterst();
    }
}




