package com.training;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Mapping {

    public static List<Integer> doubleMap(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : numbers) {
            Integer newNum = i * 2;
            newList.add(newNum);
        }

        return newList;
    }

    public static List<Integer> doubleMapOld(List<Integer> numbers) {
        return numbers.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        }).collect(Collectors.toList());
    }

    public static List<Integer> squareMap(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : numbers) {
            Integer newNum = i * i;
            newList.add(newNum);
        }

        return newList;
    }


    public static List<Integer> doubleMapUsingLambda(List<Integer> numbers) {
        return numbers.stream().map(i -> {
            return i * 2;
        }).collect(Collectors.toList());
    }

    public static List<Integer> mapWithLambda(List<Integer> numbers, Function<Integer, Integer> mapper) {
        return numbers.stream().map(mapper).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(doubleMapUsingLambda(numbers));

        System.out.println(mapWithLambda(numbers, i -> i * 2));

    }
}
