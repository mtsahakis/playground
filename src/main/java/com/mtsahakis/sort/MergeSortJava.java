package com.mtsahakis.sort;

import org.jetbrains.annotations.Nullable;

public class MergeSortJava implements OutOfPlaceSorter {

    @Override
    public int[] sort(@Nullable int[] arr) {
        if (arr == null || arr.length == 1) {
            return arr;
        }

        int min = 0;
        int mid = arr.length / 2;
        int max = arr.length;

        int[] left = sort(copy(arr, min, mid));
        int[] right = sort(copy(arr, mid, max));

        return merge(left, right);
    }

    /**
     * Merges to sorted arrays
     *
     * @param left  left array to be sorted
     * @param right right array to be sorted
     * @return sorted array
     */
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }

            k++;
        }

        for (; i < left.length; i++) {
            result[k] = left[i];
            k++;
        }

        for (; j < right.length; j++) {
            result[k] = right[j];
            k++;
        }

        return result;
    }

    private static int[] copy(int[] arr, int min, int max) {
        int length = max - min;
        int result[] = new int[length];
        System.arraycopy(arr, min, result, 0, length);
        return result;
    }
}
