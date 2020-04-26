package com.mtsahakis;

import java.util.ArrayList;
import java.util.List;

public class Covariance {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3.0f);
        numbers.add(3.0);
        numbers.add(3_000_000_000L);

        Number num = numbers.get(0);

        List<? extends Number> numbersCovariant = new ArrayList<>();
        // numbersCovariant.add(3);
        // numbersCovariant.add(3.0f);
        // numbersCovariant.add(3.0);
        // numbersCovariant.add(3L); does not compile
        Number num2 = numbersCovariant.get(0);
    }

}
