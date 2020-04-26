package com.mtsahakis.patterns

class MySingleton {

    private constructor() {

    }

    companion object {
        private lateinit var instance: MySingleton

        val mySingletonInstance: MySingleton
            get() {
                if (instance == null) {
                    instance = MySingleton()
                }
                return instance
            }
    }

}