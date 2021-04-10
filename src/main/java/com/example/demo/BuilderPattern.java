package com.example.demo;

public class BuilderPattern {
    public static void main(String ar[]){
Customer c=new Customer.CustBuilder().build();

    }


}



class Customer{
    String description;
    Customer(CustBuilder custBuild){
       this.description= custBuild.description;
    }

    public static class CustBuilder{
        String description;
        CustBuilder description(String des){
           this.description=des;
            return this;
        }


       Customer  build( ){
            Customer cust=new Customer(this);
            return cust;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;
}
