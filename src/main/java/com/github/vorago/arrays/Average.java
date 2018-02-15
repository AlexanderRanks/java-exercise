package com.github.vorago.arrays;

public class Average {
    public static int calculate(int[] array) {

        if (array.length == 0) {
            return 0;
        }

        long avg = 0;
        for (int item : array) {
            avg = avg + item;
        }

        avg = avg / array.length;
        return (int) avg;
    }

}
