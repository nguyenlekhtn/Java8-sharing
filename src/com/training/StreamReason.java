package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReason {
    public static List<Integer> doubleNumber(List<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            numbers.set(i, number * 2);
        }

        return numbers;
    }

    public static List<Integer> doubleUsingMap(List<Integer> numbers) {
        return numbers.stream().map(i -> i * 2).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2 , 3);
        List<Integer> doubledNumbers = doubleUsingMap(numbers);

        System.out.println(doubledNumbers);
        System.out.println(numbers);
    }
}
