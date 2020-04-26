package com.mtsahakis.test.quiz


import com.mtsahakis.quiz.Factorial
import com.mtsahakis.quiz.iterativeFactorialFor
import com.mtsahakis.quiz.iterativeFactorialWhile
import com.mtsahakis.quiz.recursiveFactorial
import org.junit.Assert.assertEquals
import org.junit.Test

class FactorialTest {

    @Test
    fun testFactorialForJava() {
        assertEquals(Factorial.iterativeFactorialFor(0), 1)
        assertEquals(Factorial.iterativeFactorialFor(1), 1)
        assertEquals(Factorial.iterativeFactorialFor(2), 2)
        assertEquals(Factorial.iterativeFactorialFor(3), 6)
        assertEquals(Factorial.iterativeFactorialFor(4), 24)
        assertEquals(Factorial.iterativeFactorialFor(5), 120)
    }

    @Test
    fun testFactorialForKotlin() {
        assertEquals(iterativeFactorialFor(0), 1)
        assertEquals(iterativeFactorialFor(1), 1)
        assertEquals(iterativeFactorialFor(2), 2)
        assertEquals(iterativeFactorialFor(3), 6)
        assertEquals(iterativeFactorialFor(4), 24)
        assertEquals(iterativeFactorialFor(5), 120)
    }

    @Test
    fun testFactorialWhileJava() {
        assertEquals(Factorial.iterativeFactorialWhile(0), 1)
        assertEquals(Factorial.iterativeFactorialWhile(1), 1)
        assertEquals(Factorial.iterativeFactorialWhile(2), 2)
        assertEquals(Factorial.iterativeFactorialWhile(3), 6)
        assertEquals(Factorial.iterativeFactorialWhile(4), 24)
        assertEquals(Factorial.iterativeFactorialWhile(5), 120)
    }

    @Test
    fun testFactorialWhileKotlin() {
        assertEquals(iterativeFactorialWhile(0), 1)
        assertEquals(iterativeFactorialWhile(1), 1)
        assertEquals(iterativeFactorialWhile(2), 2)
        assertEquals(iterativeFactorialWhile(3), 6)
        assertEquals(iterativeFactorialWhile(4), 24)
        assertEquals(iterativeFactorialWhile(5), 120)
    }

    @Test
    fun testFactorialRecursiveJava() {
        assertEquals(Factorial.recursiveFactorial(0), 1)
        assertEquals(Factorial.recursiveFactorial(1), 1)
        assertEquals(Factorial.recursiveFactorial(2), 2)
        assertEquals(Factorial.recursiveFactorial(3), 6)
        assertEquals(Factorial.recursiveFactorial(4), 24)
        assertEquals(Factorial.recursiveFactorial(5), 120)
    }

    @Test
    fun testFactorialRecursiveKotlin() {
        assertEquals(recursiveFactorial(0), 1)
        assertEquals(recursiveFactorial(1), 1)
        assertEquals(recursiveFactorial(2), 2)
        assertEquals(recursiveFactorial(3), 6)
        assertEquals(recursiveFactorial(4), 24)
        assertEquals(recursiveFactorial(5), 120)
    }

}