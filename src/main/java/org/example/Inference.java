package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Inference {
    public static void main(String[] args) {
        Function<String, String> greeting = name -> String.format("Welcome %s", name);
        var welcome = greeting.apply("Edied");
        System.out.println(welcome);

        List<String> names = Arrays.asList("Edied", "Ramos");
//        Explicit
        names.forEach((String name) -> System.out.println(name));

//        Implicit
        names.forEach(name -> System.out.println(name));

//        Reference method
        names.forEach(System.out::println);

    }
}
