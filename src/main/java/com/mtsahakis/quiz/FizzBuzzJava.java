package com.mtsahakis.quiz;

public class FizzBuzzJava {

    public static String process(int input) {
        if (input % 15 == 0) {
            return "FizzBuzzJava";
        } else if (input % 5 == 0) {
            return "Fizz";
        } else if (input % 3 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(input);
        }
    }

}
