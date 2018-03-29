package com.github.alexanderranks.gravitrips;

import java.util.Arrays;

class Board {
    public final int BOARD_WIDTH = 7;
    public final int BOARD_HEIGHT = 6;
    public final int WIN_LENGTH = 4;
    private boolean gameOver;
    private Cell gameWinnerFlag;

    private Cell[][] board = new Cell[BOARD_HEIGHT][BOARD_WIDTH];

    public Board() {
        // Fill each row with EMPTY
        for (Cell[] row : board)
            Arrays.fill(row, Cell.EMPTY);

        gameOver = false;
    }

    @Override
    public String toString() {

        String result;

        //Board header
        result = "Current board condition:\n";
        for (int i = 1; i <= BOARD_WIDTH; i++) {
            result += i;
        }
        result += "\n";

        //Board body
        for (Cell[] row : board) {
            for (Cell cell : row)
                result += cell;
            result += "\n";
        }
        return result;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public Cell getGameWinnerFlag() {
        return gameWinnerFlag;
    }

    public boolean trip(Cell playerFlag, int column) {

        if (this.isGameOver()) {
            System.out.println("Game is already over!");
        }

        if (!((column >= 1) && (column <= BOARD_WIDTH))) {
            System.out.println("Bad trip.");
            return false;
        }

        int row = 0;
        column--;
        while ((row < BOARD_HEIGHT) && (board[row][column] == Cell.EMPTY)) {
            row++;
        }

        if (row == 0) {
            System.out.println("Bad trip.");
            return false;
        } else {
            row--;
            board[row][column] = playerFlag;
        }

        this.evaluate();

        return true;

    }

    private void evaluate() {

        int col;
        int row;
        boolean winnerDetected = false;
        StateAccum state = new StateAccum();

        //horizontal loop
        row = 0;
        while ((state.getAccumLen() < WIN_LENGTH) && (row < BOARD_HEIGHT)) {
            col = 0;
            state = new StateAccum();
            while ((state.getAccumLen() < WIN_LENGTH) && (col < BOARD_WIDTH)) {
                state.accum(board[row][col]);
                col++;
            }
            row++;
        }

        //vertical loop
        col = 0;
        while ((state.getAccumLen() < WIN_LENGTH) && (col < BOARD_WIDTH)) {
            row = 0;
            state = new StateAccum();
            while ((state.getAccumLen() < WIN_LENGTH) && (row < BOARD_HEIGHT)) {
                state.accum(board[row][col]);
                row++;
            }
            col++;
        }

        //traverse diagonal
        int drow = 0;
        int dcol = 0;
        while ((state.getAccumLen() < WIN_LENGTH) && (dcol < BOARD_WIDTH)) {

            // slash diagonal [/]
            if (state.getAccumLen() < WIN_LENGTH) {
                state = new StateAccum();
            }
            row = drow;
            col = dcol;
            while ((state.getAccumLen() < WIN_LENGTH) && (row >= 0) && (col < BOARD_WIDTH)) {
                state.accum(board[row][col]);
                row--;
                col++;
            }

            // backslash diagonal [\]
            if (state.getAccumLen() < WIN_LENGTH) {
                state = new StateAccum();
            }
            row = drow;
            if (dcol == 0) {
                col = BOARD_WIDTH - 1;
            } else {
                col = dcol;
            }
            while ((state.getAccumLen() < WIN_LENGTH) && (row >= 0) && (col >= 0)) {
                state.accum(board[row][col]);
                row--;
                col--;
            }

            if (drow < BOARD_HEIGHT - 1) {
                drow++;
            } else {
                dcol++;
            }


        }


        //check winner condition
        if (state.getAccumLen() >= WIN_LENGTH) {
            //we have a winner
            gameOver = true;
            gameWinnerFlag = state.getAccumState();
        } else {
            //check space for next trip
            row = 0;
            col = 0;
            while ((col < BOARD_WIDTH) && (board[row][col] != Cell.EMPTY)) {
                col++;
            }
            if (col >= BOARD_WIDTH) {
                //no space, no winner
                gameOver = true;
                gameWinnerFlag = Cell.EMPTY;
            }
        }


    }


}
