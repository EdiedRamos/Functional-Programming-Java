package org.example;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> withDecoration = text -> "<<" + text + ">>";
        UnaryOperator<String> withDots = text -> text.concat("...");

        System.out.println(withDecoration.apply("EdiedRamos"));
        System.out.println(withDots.apply("EdiedRamos"));

        BiFunction<Integer, Integer, Boolean>  equals = Integer::equals;

        System.out.println(equals.apply(2, 5));
        System.out.println(equals.apply(5, 5));
    }
}
