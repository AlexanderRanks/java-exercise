package com.github.alexanderranks.gravitrips;

abstract class Player {
    protected String name;
    private Cell flag;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Cell getFlag() {
        return flag;
    }

    private void setFlag(Cell flag) {
        this.flag = flag;
    }

    public Player(String name, Cell flag) {
        this.setName(name);
        this.setFlag(flag);
    }

    public abstract int makeTrip(Board board);

    @Override
    public String toString() {
        return name;
    }
}
