# Java 8 Sharing

* stream API
* lambda expression

## Why

### Declarative over imperative
### Immutability over mutability

## Lambda expression

Example: Given a list of integer to, double each element of it

**Imperative**
```java
public static List<Integer> doubleMap(List<Integer> numbers) {
    List<Integer> newList = new ArrayList<>();
    for(Integer i : numbers) {
        newList.add(i);
    }

    return newList;
}
```

**Declarative**

Before Java 8
```java
public static List<Integer> doubleMapOld(List<Integer> numbers) {
        return numbers.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        }).collect(Collectors.toList());
    }
```

With Lambda Expression
```java
public static List<Integer> doubleMapUsingLambda(List<Integer> numbers) {
        return numbers.stream().map(i -> {
            return i * 2;
        }).collect(Collectors.toList());
}
```



## Steam API


