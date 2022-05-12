# Java 8 Sharing

* stream API
* lambda expression

## Why

### Declarative over imperative
### Immutability over mutability

## Lambda expression

Example: Given a list of Integer numbers, return a list with each element is doubled

**Imperative**
```java
public static List<Integer> doubleMap(List<Integer> numbers) {
    List<Integer> newList = new ArrayList<>();
    for(Integer i : numbers) {
        newList.add(i * 2);
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

## Problem with Mutating
```java
public static List<Number> doubleNumber(List<Number> numbers) {
    for(int i = 0; i < numbers.size(); i++) {
        Integer number = numbers.get(i);
        numbers.set(i, number * 2);
    }

    return numbers;
}
```
Not mutated

```java
public static List<Integer> doubleMap(List<Integer> numbers) {
    List<Integer> newList = new ArrayList<>();
    for(Integer i : numbers) {
        newList.add(i);
    }

    return newList;
}
```

Using Stream's mapping
```java
public static List<Integer> doubleUsingMap(List<Integer> numbers) {
    return numbers.stream().map(i -> i * 2).collect(Collectors.toList());
}
```

### Stream creations
```java
List<Integer> numbers = Arrays.asList(1, 2, 3);
Stream<Integer> stream = numbers.stream();
```

### Stream Operations
```
Stream Operations =  intermediate operations (return Stream<T>) + 
                     terminal operations (return a result of definite type).
```

**Intermediate operations**
* filter
* map
* ...

**Terminal operations**

* Matching
```java
boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
boolean isValidOne = list.stream().allMatch(element -> element.contains("h")); // false
boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h")); // false
```

* Collecting
```java
List<String> resultList 
  = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
```

* forEach

## Optinal

### Why

```java
String version = computer.getSoundcard().getVersion();
```

<img src="./img/2175762.webp">

### Creating Optional object

To create an empty Optional
```java
Optional<String> empty = Optional.empty();

```
an Optional with a non-null value:
```java
Optional<Soundcard> sc = Optional.of(soundcard);
// NullPointerException will be thrown if argument is null
```

in case we expect some null values, we can use the ofNullable() method:
```java
Optional<String> opt = Optional.ofNullable(name);
```

### Checking Value Present
```java
Optional<String> opt = Optional.of("Baeldung");
assertTrue(opt.isPresent());

opt = Optional.ofNullable(null);
assertFalse(opt.isPresent());
```

```java
Optional<String> opt = Optional.of("hello");
opt.ifPresent(name -> System.out.println(name.length()));
```

