package com.mtsahakis.common

class Utils {

    companion object {

        @JvmStatic
        fun swap(arr: IntArray, i: Int, j: Int) {
            if (i == j) {
                return
            }

            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }

    }
}
