package com.mtsahakis.test.sort

import com.mtsahakis.sort.InsertionSortJava
import com.mtsahakis.sort.InsertionSortKotlin
import com.mtsahakis.test.common.testSort
import org.junit.Test

class InsertionSortTest {

    private val javaSorter = InsertionSortJava()
    private val kotlinSorter = InsertionSortKotlin()

    @Test
    fun testBubbleSortJava() {
        testSort(javaSorter)
    }

    @Test
    fun testBubbleSortKotlin() {
        testSort(kotlinSorter)
    }

}