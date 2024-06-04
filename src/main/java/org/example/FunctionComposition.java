package org.example;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> byThree = (x) -> x * 3;
        Function<Integer, Integer> plusOneAndByThree =
                byThree.compose(y -> y + 1);
        Function <Integer, Integer> andSquare = plusOneAndByThree.andThen(z -> z * z);
        int rest = andSquare.apply(5);
        System.out.println(rest);
    }
}
