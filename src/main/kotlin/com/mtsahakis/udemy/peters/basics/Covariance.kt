package com.mtsahakis.udemy.peters.basics

class Source<out T>(val t: T) {
    fun produce(): T {
        return t
    }
}

class Sink<in T> {
    fun consume(t : T) {

    }
}

fun main() {

}