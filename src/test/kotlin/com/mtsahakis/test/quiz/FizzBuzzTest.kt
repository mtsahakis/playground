package com.mtsahakis.test.quiz

import com.mtsahakis.quiz.FizzBuzzJava
import com.mtsahakis.quiz.process
import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun testFizzBuzzJava() {
        assertEquals(FizzBuzzJava.process(5), "Fizz")
        assertEquals(FizzBuzzJava.process(15), "FizzBuzzJava")
        assertEquals(FizzBuzzJava.process(10), "Fizz")
        assertEquals(FizzBuzzJava.process(81), "Buzz")
        assertEquals(FizzBuzzJava.process(22), "22")
    }

    @Test
    fun test() {
        assertEquals(process(5), "Fizz")
        assertEquals(process(15), "FizzBuzzJava")
        assertEquals(process(10), "Fizz")
        assertEquals(process(81), "Buzz")
        assertEquals(process(22), "22")
    }
}