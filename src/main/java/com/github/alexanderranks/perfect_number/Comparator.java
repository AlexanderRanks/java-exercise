package com.github.alexanderranks.perfect_number;

public enum Comparator {
    LESS("Deficinet"),
    EQUAL("Perfect"),
    GREATER("Abundant");
    private final String displayValue;

    Comparator(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return String.valueOf(displayValue);
    }
}
