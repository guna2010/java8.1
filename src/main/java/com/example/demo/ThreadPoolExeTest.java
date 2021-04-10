package com.example.demo;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExeTest {

    ExecutorService executor = Executors.newSingleThreadExecutor();


    public static void main(String ar[]) {
      int  y=0;
        System.out.println("  Main ");

        {
           Callable cinner = () -> {
                System.out.println(" Thread started");

                System.out.println(" y=" + y);
                return null;
            };
            ExecutorService executorService =
                    Executors.newFixedThreadPool(10);
            System.out.println(" Thread Finished ");
            executorService.submit(cinner);
        }
    }
}


