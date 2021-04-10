package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTest {
    public static void main(String ar[]) throws Exception {
        int arr[]= {9,1,2,8,7,3};
        int n=9;
        List<Integer> intArr= Arrays.stream(arr).boxed().collect(Collectors.toList());
        int c = intArr.stream()
                .min(Comparator.comparingInt(i -> i-n))
                .orElseThrow(() -> new Exception("No value present"));
        System.out.println("                findNum"+c);


/*    int arr[]= {9,1,2,8,7,3};
    int diff=0;
    int target=3;
    int len=arr.length;   // -2  6        1
    int findNum=0;
    for(int i=0;i<len;i++){
        diff=target-findNum;
            if(diff>arr[i] ){
                findNum=arr[i];
        }
    }*/
   // System.out.println("                findNum"+findNum);

    }
}
