package com.mtsahakis.test.sort

import com.mtsahakis.sort.MergeSortJava
import com.mtsahakis.test.common.testSort
import org.junit.Test

class MergeSortTest {

    private val javaSorter = MergeSortJava()

    @Test
    fun testMergeSortJava() {
        testSort(javaSorter)
    }

}