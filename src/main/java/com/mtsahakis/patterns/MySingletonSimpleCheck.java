package com.mtsahakis.patterns;

public class MySingletonSimpleCheck {

    private MySingletonSimpleCheck() {
    }

    private static MySingletonSimpleCheck INSTANCE;

    MySingletonSimpleCheck getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySingletonSimpleCheck();
        }
        return INSTANCE;
    }

}
