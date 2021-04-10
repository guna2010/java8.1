package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListNumberToSQR {
    public static void main(String arg[]){
        List<Integer> Numbers = Arrays.asList(4,2,2,4,9,4,5,7);
        Set sqr=Numbers.stream().map(s->s*s).collect(Collectors.toSet());

        sqr.forEach(System.out::println);
    }

}
