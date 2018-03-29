package com.github.alexanderranks.gravitrips;

import java.util.Scanner;

class Human extends Player {
    public Human(String name, Cell flag) {
        super(name, flag);
    }

    @Override
    public int makeTrip(Board board) {
        System.out.println(board);
        System.out.println(this.getName() + ", Your trip [1-" + board.BOARD_WIDTH + "]: ");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        boolean prompt;
        do {
            prompt = false;
            try {
                i = Integer.valueOf(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong value. Try again [1-" + board.BOARD_WIDTH + "]: ");
                prompt = true;
            }
        } while (prompt);
        //scanner.close();

        return i;
    }
}
