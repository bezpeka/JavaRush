package com.javarush.minesweeper;

import java.util.Random;

public class MinesweeperBoard {
    private int rows;
    private int cols;
    private int numMines;
    private Cell[][] cells;

    public MinesweeperBoard(int rows, int cols, int numMines) {
        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;

        // Initialize cells array
        cells = new Cell[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new Cell(false);
            }
        }

        // Generate mines
        Random random = new Random();

        int minesGenerated = 0;
        while (minesGenerated < numMines) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);
            if (!cells[row][col].isMine()) {
                cells[row][col].setMine();
                minesGenerated++;
                System.out.println("Mine generated at (" + row + ", " + col + ")");
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getAdjacentMines(int row, int col) {
        int count = 0;
        for (int r = Math.max(0, row - 1); r <= Math.min(rows - 1, row + 1); r++) {
            for (int c = Math.max(0, col - 1); c <= Math.min(cols - 1, col + 1); c++) {
                if (r == row && c == col) {
                    continue;
                }
                if (cells[r][c].isMine()) {
                    count++;
                }
            }
        }
        return count;
    }
}

//public class Cell {
//    private boolean isMine;
//
//    public Cell(boolean isMine) {
//        this.isMine = isMine;
//    }
//
//    public boolean isMine() {
//        return isMine;
//    }
//
//    public void setMine() {
//        isMine = true;
//    }
//}
