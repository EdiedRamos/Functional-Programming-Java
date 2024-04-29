package org.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionFP {
    public static void main(String[] args) {
        Function<Integer, Integer> twoTimes = new Function<>() {
            @Override
            public Integer apply(Integer t) {
                return 2 * t;
            }
        };

        System.out.println(twoTimes.apply(5));

        /*
         * Function to verify if the string is in upper case
         * @param s string the string to be verified
         * @return true if the given string is in upper case otherwise false
         * */
        Function<String, Boolean> isUpper = new Function<>() {
            @Override
            public Boolean apply(String s) {
                return s.equals(s.toUpperCase());
            }
        };

        String username = "EdiedRamos";
        var isUserNameUpper = isUpper.apply(username);

        System.out.println(isUserNameUpper);

//        Using lambda function
        Function<Integer, Boolean> isOdd = x -> (x & 1) == 1;

        var is5Odd = isOdd.apply(5);
        var is10Odd = isOdd.apply(10);

        System.out.println("is 5 odd? = " + is5Odd);
        System.out.println("is 10 odd? = " + is10Odd);

//        Predicate
        Predicate<Integer> isEven = x -> (x & 1) == 0;

        isEven.test(10); // true
        isEven.test(1); // false

        Predicate<Box> isHeavy = box -> box.getWeight() > 5.5;

        Box box = new Box(5.7);
        System.out.println(isHeavy.test(box));

    }

    static class Box {
        private double weight;

        public Box(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }
    }
}
