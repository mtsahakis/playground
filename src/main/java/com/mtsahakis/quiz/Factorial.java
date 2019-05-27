package com.mtsahakis.quiz;

public class Factorial {

    public static int iterativeFactorialFor(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("factorial input cannot be negative");
        }

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static int iterativeFactorialWhile(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("factorial input cannot be negative");
        }

        int result = 1;
        int i = num;

        while (i > 1) {
            result *= i;
            i--;
        }

        return result;
    }

    public static int recursiveFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("factorial input cannot be negative");
        }

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

}
