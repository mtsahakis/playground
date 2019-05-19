package com.mtsahakis.test

import com.mtsahakis.sort.BubbleSortJava
import com.mtsahakis.sort.BubbleSortKotlin.Companion.sort
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class BubbleSortTest {

    @Test
    fun testBubbleSortJava() {
        // given
        val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

        // when
        BubbleSortJava.sort(input)

        // then
        assertArrayEquals(expected, input)
    }

    @Test
    fun testBubbleSortKotlin() {
        // given
        val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

        // when
        sort(input)

        // then
        assertArrayEquals(expected, input)
    }

}