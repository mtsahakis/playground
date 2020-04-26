package com.mtsahakis.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(3.14);
        numbers.add(3.14f);
        numbers.add(3);

        for (Number num : numbers) {
            System.out.println("num is of type: " + num.getClass() + ", with value: " + num);
        }
    }
}
