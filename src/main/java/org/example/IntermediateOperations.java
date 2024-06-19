package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Edied", "Isaias", "Ramos", "hernandez");
        names.stream()
                .map(String::toUpperCase)
                .map(String::toLowerCase)
                .forEach(System.out::println);

        Stream<String> languages = Stream.of("Java", "Cpp", "Python", "Javascript", "Typescript");

        Stream<Integer> lettersOnLanguages = languages.map(String::length);

        Stream<Integer> evenLanguagesLength = lettersOnLanguages.filter(length -> length % 2 == 0);

        evenLanguagesLength.forEach(System.out::println);
    }
}
