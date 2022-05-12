package com.training;

public class Test {
    public static void main(String[] args) {
        List<String> listOpt = getList().orElseGet(() -> new ArrayList<>());
    }
}
