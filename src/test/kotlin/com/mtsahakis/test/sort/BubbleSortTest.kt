package com.mtsahakis.test.sort

import com.mtsahakis.sort.BubbleSortJava
import com.mtsahakis.sort.BubbleSortKotlin
import com.mtsahakis.test.common.testSort
import org.junit.Test

class BubbleSortTest {

    private val javaSorter = BubbleSortJava()
    private val kotlinSorter = BubbleSortKotlin()

    @Test
    fun testBubbleSortJava() {
        testSort(javaSorter)
    }

    @Test
    fun testBubbleSortKotlin() {
        testSort(kotlinSorter)
    }

}