package com.github.vorago.basics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxOfThreeTest {

    @Test
    void combinations() {
        assertThat(MaxOfThree.max(1, 2, 3)).isEqualTo(3);
        assertThat(MaxOfThree.max(1, 3, 2)).isEqualTo(3);
        assertThat(MaxOfThree.max(2, 1, 3)).isEqualTo(3);
        assertThat(MaxOfThree.max(2, 3, 1)).isEqualTo(3);
        assertThat(MaxOfThree.max(3, 1, 2)).isEqualTo(3);
        assertThat(MaxOfThree.max(3, 2, 1)).isEqualTo(3);
    }

    @Test
    void equalPair() {
        assertThat(MaxOfThree.max(10, 10, 1)).isEqualTo(10);
        assertThat(MaxOfThree.max(10, 1, 1)).isEqualTo(10);
    }

    @Test
    void allEqual() {
        assertThat(MaxOfThree.max(0, 0, 0)).isEqualTo(0);
    }

}