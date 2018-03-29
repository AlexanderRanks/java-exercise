package com.github.alexanderranks.gravitrips;

public enum Cell {
    PLAYER_1("X"),
    PLYER_2("O"),
    EMPTY("|");
    private final String displayValue;

    Cell(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return String.valueOf(displayValue);
    }
}
