package com.github.vorago.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageTest {

    @Test
    void Math() {
        int[] input = {1, 2, 3, 4};
        assertThat(Average.calculate(input)).isEqualTo(2);

        int[] input2 = {100, 500, 1, 1000};
        assertThat(Average.calculate(input2)).isEqualTo(400);

        int[] input3 = {2983, 7288, 34, 8, 232, 6576, 654, 0, 0, 4, 1, 44, 33, 845};
        assertThat(Average.calculate(input3)).isEqualTo(1335);
    }

    @Test
    void emptyArray() {
        int[] input = {};

        assertThat(Average.calculate(input)).isEqualTo(0);
    }

    @Test
    void single() {
        int[] input = {33};
        assertThat(Average.calculate(input)).isEqualTo(33);
    }

    @Test
    void DefaultIntArray() {
        int[] input = new int[5];
        assertThat(Average.calculate(input)).isEqualTo(0);
    }
}
