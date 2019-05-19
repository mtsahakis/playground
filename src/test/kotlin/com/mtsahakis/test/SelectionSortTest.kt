package com.mtsahakis.test

import com.mtsahakis.sort.SelectionSortJava
import com.mtsahakis.sort.SelectionSortKotlin.Companion.sort
import org.junit.Assert
import org.junit.Test

class SelectionSortTest {

    @Test
    fun testSelectionSortJava() {
        // given
        val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

        // when
        SelectionSortJava.sort(input)

        // then
        Assert.assertArrayEquals(expected, input)
    }

    @Test
    fun testSelectionSortKotlin() {
        // given
        val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

        // when
        sort(input)

        // then
        Assert.assertArrayEquals(expected, input)
    }
}