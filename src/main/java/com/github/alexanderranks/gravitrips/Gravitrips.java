package com.github.alexanderranks.gravitrips;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Gravitrips {

    private Map<Cell, Player> players = new LinkedHashMap<Cell, Player>();
    private Board board = new Board();

    public void playGame() {
        Player player;

        for (Cell flag : Cell.values()) {
            if (flag != Cell.EMPTY) {
                player = initializePlayer(flag);
                players.put(flag, player);
            }
        }

        while (!board.isGameOver()) {
            for (Cell playerFlag : players.keySet()) {
                if (!board.isGameOver()) {
                    player = players.get(playerFlag);
                    boolean goodTrip = false;
                    do {
                        int column = player.makeTrip(board);
                        goodTrip = board.trip(player.getFlag(), column);
                    } while (!goodTrip);
                }
            }
        }

        System.out.println();
        System.out.println(board);
        System.out.println("Game Over");
        if (board.getGameWinnerFlag() == Cell.EMPTY) {
            System.out.println("No winner.");
        } else {
            player = players.get(board.getGameWinnerFlag());
            System.out.println("The winner is: " + player);
        }

    }

    private Player initializePlayer(Cell flag) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Player '" + flag + "' name: ");
        String name = scanner.nextLine();
        System.out.println(name + " is human?");

        String userInput;
        do {
            System.out.print("[Y/N]: ");
            userInput = scanner.nextLine().toUpperCase();
        } while ((!userInput.equals("Y")) && (!userInput.equals("N")));

        Player player;
        boolean isHuman = userInput.equals("Y");
        if (isHuman) {
            player = new Human(name, flag);
        } else {
            player = new Computer(name, flag);
        }

        //scanner.close();
        return player;
    }


}
