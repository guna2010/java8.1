package com.example.demo;

public class AbstractFactExample {
    public static void main(String ar[]){
        System.out.println(" MAIN\n\n");
        UtensilFactory factory=new MicrowaveUtensilFactory();
       String MicroPlate= factory.getPlate().getName();
        System.out.println(" NonMicroPlate="+MicroPlate);
        factory=new NonMicrowaveUtensilFactory();
       String NonMicroPlate= factory.getPlate().getName();
        System.out.println(" NonMicroPlate="+NonMicroPlate);
    }


}
interface Utensil{
   String getName();
}
class PlateNonMicro implements Utensil{


    @Override
    public String getName() {
        return " PlateNonNNNNNNMicro";
    }
}

class PlateMicro implements Utensil{


    @Override
    public String getName() {
        return " PlateMicro";
    }
}

interface UtensilFactory {
    Utensil  getPlate();

}
class MicrowaveUtensilFactory implements UtensilFactory{
    @Override
    public Utensil getPlate() {
        return new PlateMicro();
    }
}


class NonMicrowaveUtensilFactory implements UtensilFactory{
    @Override
    public Utensil getPlate() {
        return new PlateNonMicro();
    }
}


