package com.github.vorago.basics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void plainNumber() {
        assertThat(FizzBuzz.check(1)).isEqualTo("1");
        assertThat(FizzBuzz.check(117)).isEqualTo("109");
    }

    @Test
    void fizz() {
        assertThat(FizzBuzz.check(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.check(18)).isEqualTo("Fizz");
    }

    @Test
    void buzz() {
        assertThat(FizzBuzz.check(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.check(100)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz() {
        assertThat(FizzBuzz.check(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.check(300)).isEqualTo("FizzBuzz");
    }

}