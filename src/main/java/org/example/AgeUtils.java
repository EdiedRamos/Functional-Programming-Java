package org.example;

public class AgeUtils {

//    SAM = Single Abstract Method

    public static void main(String[] args) {
        TriFunction<String, Integer, Integer, String> withDecoration = (text, left, right) ->
                "<<".repeat(left).concat(text).concat(">>".repeat(right));

        System.out.println(withDecoration.apply("EdiedRamos", 5, 10));
    }

    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }
}
