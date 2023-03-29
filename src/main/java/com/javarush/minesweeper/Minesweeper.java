package com.javarush.minesweeper;

public class Minesweeper {
    public static void main(String[] args) {
        System.out.println("Welcome to Minesweeper!");
        MinesweeperBoard board = new MinesweeperBoard(10, 10, 10);

        Cell cell = board.getCell(0, 0);
        System.out.println("Cell at (0, 0) contains a mine: " + cell.isMine());
    }
}
