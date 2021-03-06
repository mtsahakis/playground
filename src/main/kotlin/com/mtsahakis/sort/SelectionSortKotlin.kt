package com.mtsahakis.sort

import com.mtsahakis.common.Utils.Companion.swap

class SelectionSortKotlin : InPlaceSorter {

    override fun sort(arr: IntArray?) {
        if (arr == null || arr.size == 1) {
            return
        }

        for (i in arr.indices) {
            var maxIndex = 0

            for (j in 1 until arr.size - i) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j
                }
            }

            val sortedIndex = arr.size - i - 1
            swap(arr, maxIndex, sortedIndex)
        }

    }
}