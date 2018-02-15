package com.github.vorago.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwapTest {
    @Test
    void firstAndLast() {
        int[] input = {1, 2, 3, 4};

        assertThat(Swap.firstAndLast(input)).containsExactly(4, 2, 3, 1);
        //assertThat(Swap.firstAndLast(input)).
    }

    @Test
    void emptyArray() {
        int[] input = {};

        assertThat(Swap.firstAndLast(input)).isEmpty();
    }

    @Test
    void single() {
        int[] input = {10};

        assertThat(Swap.firstAndLast(input)).containsExactly(10);
    }

    @Test
    void DefaultIntArray() {
        int[] input = new int[5];

        assertThat(Swap.firstAndLast(input)).containsExactly(0, 0, 0, 0, 0);
    }

}