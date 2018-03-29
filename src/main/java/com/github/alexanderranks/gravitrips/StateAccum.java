package com.github.alexanderranks.gravitrips;

public class StateAccum {
    private Cell accumState = Cell.EMPTY;
    private int accumLen = 0;

    public Cell getAccumState() {
        return accumState;
    }

    public int getAccumLen() {
        return accumLen;
    }

    public int accum(Cell newState) {

        if (newState == Cell.EMPTY) {
            accumLen = 0;
        } else if (newState != accumState)
            accumLen = 1;
        else {
            accumLen++;
        }

        accumState = newState;
        return accumLen;
    }

}

