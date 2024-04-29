package org.example;

import java.util.function.Function;

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
    }
}
