package com.mtsahakis.test.sort

import com.mtsahakis.sort.SelectionSortJava
import com.mtsahakis.sort.SelectionSortKotlin
import com.mtsahakis.test.common.testSort
import org.junit.Test

class SelectionSortTest {

    private val javaSorter = SelectionSortJava()
    private val kotlinSorter = SelectionSortKotlin()

    @Test
    fun testSelectionSortJava() {
        testSort(javaSorter)
    }

    @Test
    fun testSelectionSortKotlin() {
        testSort(kotlinSorter)
    }
}