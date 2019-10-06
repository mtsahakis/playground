package com.mtsahakis.sort;

import static com.mtsahakis.common.Utils.swap;

public class InsertionSortJava implements InPlaceSorter {

    public void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }

}
