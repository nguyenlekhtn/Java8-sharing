package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3);
//        Stream<Integer> stream = numbers.stream();


//        List<Integer> numbers = Arrays.asList(-1, 2, 3);
//        List<Integer> positiveNumber = numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
//        System.out.println(positiveNumber);

        List<Integer> numbers = Arrays.asList(-1, 2, 3);
        List<Integer> positiveNumber = numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
        System.out.println(positiveNumber);
    }
}
