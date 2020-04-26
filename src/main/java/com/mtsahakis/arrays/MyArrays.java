package com.mtsahakis.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrays {

    public static void main(String[] args) {
        int[] primitive = new int[] {1, 2, 3};
        System.out.println(primitive);
        System.out.println(Arrays.toString(primitive));

        Integer[] object = {1, 2, 3};

        Arrays.asList(primitive); // returns an Arrays.ArrayList of length 1 and single element the primitive array passed
        Arrays.asList(object); // returns Arrays.ArrayList of length 3 {Integer(1), Integer(2), Integer(3)}

        List<Integer> list = new ArrayList<>();
        System.out.println(list);

        int[] array = {23, 43, 55, 12};
        int newLength = array.length;
        int[] copiedArray = Arrays.copyOf(array, 4);
        System.out.println(Arrays.toString(copiedArray));
    }

}
