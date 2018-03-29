package com.github.alexanderranks.gravitrips;

class Player {
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

    public int makeTrip(Board board) {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
