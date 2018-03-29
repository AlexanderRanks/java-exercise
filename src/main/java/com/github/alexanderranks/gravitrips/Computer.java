package com.github.alexanderranks.gravitrips;

class Computer extends Player {
    public Computer(String name, Cell flag) {
        super(name, flag);
    }

    public int makeTrip(Board board) {
        System.out.print(this.getName() + " tripping to: ");
        int i = (int) (Math.random() * board.BOARD_WIDTH + 1);
        System.out.println(i);

        return i;
    }
}
