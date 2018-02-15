package com.github.vorago.arrays;

public class Swap {
    public static int[] firstAndLast(int[] array) {
        int size = array.length;
        if (size > 0) {
            int temp = array[0];
            array[0] = array[size - 1];
            array[size - 1] = temp;
        }
        return array;
    }
}
