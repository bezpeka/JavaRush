package com.javarush.minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minesweeper extends JFrame {
    private MinesweeperBoard board;
    private JButton[][] buttons;

    public Minesweeper(int rows, int cols, int numMines) {
        board = new MinesweeperBoard(rows, cols, numMines);

        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(new GridLayout(rows, cols));
        buttons = new JButton[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                JButton button = new JButton();
                button.addActionListener(new CellButtonListener(row, col));
                container.add(button);
                buttons[row][col] = button;
            }
        }

        setSize(cols * 40, rows * 40);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateButton(int row, int col) {
        Cell cell = board.getCell(row, col);
        if (cell.isMine()) {
            buttons[row][col].setText("X");
            JOptionPane.showMessageDialog(this, "Game over!");
            System.exit(0);
        } else {
            int adjacentMines = board.getAdjacentMines(row, col);
            buttons[row][col].setEnabled(false);
            if (adjacentMines == 0) {
                buttons[row][col].setText("");
                for (int r = Math.max(0, row - 1); r <= Math.min(board.getRows() - 1, row + 1); r++) {
                    for (int c = Math.max(0, col - 1); c <= Math.min(board.getCols() - 1, col + 1); c++) {
                        if (r != row || c != col) {
                            if (buttons[r][c].isEnabled()) {
                                updateButton(r, c);
                            }
                        }
                    }
                }
            } else {
                buttons[row][col].setText(String.valueOf(adjacentMines));
            }
        }
    }




    public class CellButtonListener implements ActionListener {
        private int row;
        private int col;

        public CellButtonListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Cell cell = board.getCell(row, col);
            if (cell.isMine()) {
                buttons[row][col].setText("X");
                JOptionPane.showMessageDialog(null, "Game Over!");
                System.exit(0);
            } else {
                int adjacentMines = board.getAdjacentMines(row, col);
                buttons[row][col].setText(String.valueOf(adjacentMines));
                buttons[row][col].setEnabled(false);
                if (adjacentMines == 0) {
                    updateButton(row, col);
                }
            }
        }
    }

    public static void main(String[] args) {
        Minesweeper game = new Minesweeper(10, 10, 10);
    }
}
