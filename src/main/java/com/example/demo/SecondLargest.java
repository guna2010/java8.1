package com.example.demo;

public class SecondLargest {
    public static void main(String arg[]){
        int arr[]={3,5,2,81,9,7,44,33};
        int len=arr.length;
        int largest=arr[0];
        int secondLargest=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {//   5>3 sl=5, la=5 ,2>5 81>5 sl=81 ,l=81 9>81
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {  //2>5 9>81
                secondLargest= arr[i];

            }
        }


        System.out.println("second="+secondLargest);
    }

}
