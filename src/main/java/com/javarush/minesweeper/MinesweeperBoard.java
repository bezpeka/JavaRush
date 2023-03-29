package com.javarush.minesweeper;

public class MinesweeperBoard {
    private Cell[][] board;

    public MinesweeperBoard(int rows, int cols, int mines) {
        board = new Cell[rows][cols];
        int minesLeft = mines;

        // Initialize board with empty cells
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = new Cell(false);
            }
        }

        // Add mines to board
        while (minesLeft > 0) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);

            if (!board[row][col].isMine()) {
                board[row][col] = new Cell(true);
                minesLeft--;
            }
        }
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public void printBoard() {
        System.out.print("  ");
        for (int col = 0; col < board[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board[0].length; col++) {
                if (!board[row][col].isOpen()) {
                    System.out.print("- ");
                } else if (board[row][col].isMine()) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Метод openCell открывает выбранную ячейку и рекурсивно открывает все соседние ячейки, если выбранная ячейка не содержит мины.
    public void openCell(int row, int col) {
        Cell cell = board[row][col];

        if (!cell.isOpen()) {
            cell.open();

            if (cell.isMine()) {
                System.out.println("Game over! You hit a mine.");
                printBoard();
            } else {
                // Open adjacent cells
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
                            openCell(i, j);
                        }
                    }
                }

                if (isGameWon()) {
                    System.out.println("Congratulations! You won the game.");
                    printBoard();
                }
            }
        }
    }

    //метод isGameWon(), который проверит, выиграл ли игрок. Для этого нам нужно проверить, остались ли на поле неоткрытые ячейки, которые не содержат мины.
    public boolean isGameWon() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                Cell cell = board[row][col];
                if (!cell.isOpen() && !cell.isMine()) {
                    return false;
                }
            }
        }
        return true;
    }
}
