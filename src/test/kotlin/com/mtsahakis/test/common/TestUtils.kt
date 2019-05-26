package com.mtsahakis.test.common

import com.mtsahakis.sort.Sorter
import org.junit.Assert

fun testSort(sorter: Sorter) {
    // given
    val input = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    val expected = intArrayOf(-22, -15, 1, 7, 20, 35, 55)

    // when
    sorter.sort(input)

    // then
    Assert.assertArrayEquals(expected, input)
}