package org.example;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> programmingLanguages = Arrays.asList("Python",
                "Java",
                "Javascript",
                "Typescript");
        programmingLanguages.forEach((language) -> {
            language = language.concat("!");
            System.out.println(language);
        });
    }
}
