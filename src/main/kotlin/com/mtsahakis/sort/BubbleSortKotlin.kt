package com.mtsahakis.sort

import com.mtsahakis.common.Utils.Companion.swap

class BubbleSortKotlin : Sorter {

    override fun sort(arr: IntArray?) {
        if (arr == null || arr.size == 1) {
            return
        }

        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1)
                }
            }
        }
    }
}