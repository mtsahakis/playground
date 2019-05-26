package com.mtsahakis.sort;

import com.mtsahakis.common.Utils;

public class SelectionSortJava implements Sorter {

    public void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int sortedIndex = arr.length - i - 1;
            Utils.swap(arr, maxIndex, sortedIndex);
        }
    }

}
