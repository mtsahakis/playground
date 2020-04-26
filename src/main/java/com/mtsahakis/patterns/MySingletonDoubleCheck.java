package com.mtsahakis.patterns;

public class MySingletonDoubleCheck {

    private MySingletonDoubleCheck() {
    }

    private static MySingletonDoubleCheck INSTANCE;

    MySingletonDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
