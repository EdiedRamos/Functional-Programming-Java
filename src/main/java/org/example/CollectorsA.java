package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsA {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> data = infiniteStream
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

//      .collect(Collectors.toList()) return a mutable object
//      .toList() return a immutable object

        data.add(100);

        data.forEach(System.out::println);

    }
}
