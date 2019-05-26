package com.mtsahakis.sort

import com.mtsahakis.common.Utils.Companion.swap

class InsertionSortKotlin : Sorter {

    override fun sort(arr: IntArray?) {
        if (arr == null || arr.size == 1) {
            return
        }

        for (i in 1 until arr.size) {
            val key = arr[i]
            var j = i - 1
            while (j >= 0 && key < arr[j]) {
                swap(arr, j, j + 1)
                j--
            }
        }
    }
}