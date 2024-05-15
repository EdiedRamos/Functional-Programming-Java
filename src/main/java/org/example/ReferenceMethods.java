package org.example;

import java.util.Arrays;
import java.util.List;

public class ReferenceMethods {
    public static void main(String[] args) {
        List<String> languages = getList("Java", "Cpp", "Javascript");
//        Reference methods ::
        languages.forEach(System.out::println);
    }

    @SafeVarargs
    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}
