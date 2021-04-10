package com.example.demo;

import java.util.Arrays;

public class MedianInArray {
    public static void main(String ar[]){
        int a[] = { 1, 3, 4, 2, 7, 5, 8 };
      double medaian=  getMedain(a);
      System.out.println("Median="+medaian);
    }
    // 2,3,4,5
    static double getMedain(int arr[]){
        double medain=0.0d;
        Arrays.sort(arr);
        int len=arr.length;
        int half=len/2;
        if(len%2==0){

           int x= arr[half-1];
           int y=arr[half];
            medain=(x+y)/2.0;
        }
        else{
            medain=arr[half];
        }
        return medain;
    }


}
