package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        System.out.println("Enter size ");
        ArrayList<Integer> values=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        System.out.println("int name "+size);
        for(int i=0;i<size;i++){
            int value=scan.nextInt();
            values.add(value);
        }
       long arr = values.stream().mapToInt(i->  i).count();
        values.trimToSize();
        System.out.println("values "+values);


    }
    }
