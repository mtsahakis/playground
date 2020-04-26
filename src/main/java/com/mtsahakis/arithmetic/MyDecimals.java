package com.mtsahakis.arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

public class MyDecimals {

    public static void main(String[] args) {
        System.out.println(1.03 - 0.42); // as double
        System.out.println(1.03f - 0.42f); // as float
        System.out.println(1.0 - 9 * 0.1); // as float
        System.out.println(1.0f - 9 * 0.1f); // as float
        System.out.println("##################");
        itemsBoughtDouble();
        System.out.println("##################");
        itemsBoughtFloat();
        System.out.println("##################");
        itemsBoughtBigDecimal();
        System.out.println("##################");
        System.out.println("1/7 double: " + 1/7.0);
        System.out.println("##################");
        System.out.println("1/7 float: " + 1/7.0f);
        System.out.println("##################");
        System.out.println("1/7 big decimal: " + (new BigDecimal("1.0").divide(new BigDecimal("7.0"), new MathContext(5, RoundingMode.HALF_UP))));
        System.out.println("1/7 big decimal: " + (new BigDecimal(1.0).divide(new BigDecimal(7.0), new MathContext(5, RoundingMode.HALF_UP))));
    }

    static void itemsBoughtDouble() {
        double funds = 1.0;
        int itemsBought = 0;
        for (double price = 0.1; funds >= price; price += 0.1) {
            funds -= price;
            itemsBought++;
        }
        System.out.println("funds left: " + funds);
        System.out.println("items bought: " + itemsBought);
    }

    static void itemsBoughtFloat() {
        float funds = 1.0f;
        int itemsBought = 0;
        for (float price = 0.1f; funds >= price; price += 0.1f) {
            funds -= price;
            itemsBought++;
        }
        System.out.println("funds left: " + funds);
        System.out.println("items bought: " + itemsBought);
    }

    static void itemsBoughtBigDecimal() {
        BigDecimal funds = new BigDecimal("1.0");
        BigDecimal TEN_CENTS = new BigDecimal("0.1");
        int itemsBought = 0;
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println("funds left: " + funds);
        System.out.println("items bought: " + itemsBought);
    }

}
