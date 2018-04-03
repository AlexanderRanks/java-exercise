package com.github.alexanderranks.perfect_number;


import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class PerfectNumber {

    public static void main(String[] args) {
        int n = 6;
        Optional<Integer> sum = IntStream.range(1, n)
                .boxed()
                .filter((i) -> n % i == 0)
                .reduce((a, b) -> a + b);
        sum.ifPresent((x) -> describe(x, n));
    }

    public static void describe(int sum, int n) {
        if (sum < n) {
            System.out.println(Comparator.LESS);
        } else if (sum > n) {
            System.out.println(Comparator.GREATER);
        } else {
            System.out.println(Comparator.EQUAL);
        }
    }
}
