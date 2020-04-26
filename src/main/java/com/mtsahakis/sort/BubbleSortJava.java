package com.mtsahakis.sort;

import static com.mtsahakis.common.Utils.swap;

public class BubbleSortJava implements InPlaceSorter {

    public void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

}
