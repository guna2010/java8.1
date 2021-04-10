package com.example.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureExam {
    public static void main(String ar[]) throws ExecutionException, InterruptedException {
        Supplier<Emp> s=CompletableFutureExam::getEmp;
        Function<Emp,EmpMoreInfo> f=(e)->{
            try {
                Thread.sleep(1111);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            return new EmpMoreInfo();
        };
        CompletableFuture futureC=CompletableFuture.supplyAsync(s);


        CompletableFuture fi=  futureC.thenApply(f);
       // EmpMoreInfo o=  (EmpMoreInfo) fi.get();
     //System.out.println(" 0=="+o.getNote());
     System.out.println(" End====");


    }
    static Emp getEmp(){
     Emp e=   new Emp(10,"guna",11,"IT");
        return e;
    }

    static Emp getEmpWithArg(Integer i){
        Emp e=   new Emp(10,"guna",11,"IT");
        return e;
    }



}
