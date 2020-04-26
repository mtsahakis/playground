package com.mtsahakis.test.common

import com.mtsahakis.sort.InPlaceSorter
import com.mtsahakis.sort.OutOfPlaceSorter
import org.junit.Assert

fun testSort(inPlaceSorter: InPlaceSorter) {
    // given
    val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

    // when
    inPlaceSorter.sort(input)

    // then
    Assert.assertArrayEquals(expected, input)
}

fun testSort(outOfPlaceSorter: OutOfPlaceSorter) {
    // given
    val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

    // when
    val result = outOfPlaceSorter.sort(input)

    // then
    Assert.assertArrayEquals(expected, result)
}