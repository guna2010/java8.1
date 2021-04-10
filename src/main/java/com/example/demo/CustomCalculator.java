package com.example.demo;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface CustomCalculator {

    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    default int add(IntPredicate predicate, int... nums) {
        System.out.println(" numbs=="+nums.length);
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
    public IntPredicate intPredicateeven=(x)->{
        return x%2==0;
    };
    public static IntPredicate intPredicateOdd=(x)->{
        return x%2!=0;
    };


}
