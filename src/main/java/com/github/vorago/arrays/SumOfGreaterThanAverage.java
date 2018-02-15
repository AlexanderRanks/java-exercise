package com.github.vorago.arrays;

public class SumOfGreaterThanAverage {
    public static int calculate(int[] array) {
        int avg = Average.calculate(array);
        int sum = 0;
        for (int i:array ) {
            if (i>avg) sum = sum+ i;
        }
        return sum;
    }
}
