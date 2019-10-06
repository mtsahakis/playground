package com.mtsahakis.performance;

public class PrimitiveLoop {

    public static int primitiveCount() {
        int a = 1;
        for (int i = 0; i < 1_000_000_000; i++) {
            a = a + i * 2;
        }
        return a;
    }

    public static Integer objectCount() {
        Integer a = 1;
        for (Integer i = 0; i < 1_000_000_000; i++) {
            a = a + i * 2;
        }
        return a;
    }

}
