package com.javarush.minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperGUI {
    private JFrame frame;
    private JPanel boardPanel;
    private MinesweeperBoard board;

    public MinesweeperGUI(MinesweeperBoard board) {
        this.board = board;
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boardPanel = new JPanel(new GridLayout(board.getRows(), board.getCols()));
        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getCols(); col++) {
                CellButton button = new CellButton(row, col);
                button.addActionListener(new CellButtonListener());
                boardPanel.add(button);
            }
        }

        frame.getContentPane().add(boardPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class CellButton extends JButton {
        private int row;
        private int col;

        public CellButton(int row, int col) {
            super();
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }

    private class CellButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CellButton button = (CellButton) e.getSource();
            int row = button.getRow();
            int col = button.getCol();
            Cell cell = board.getCell(row, col);
            cell.open();
            updateButtons();
        }
    }

    private void updateButtons() {
        for (Component component : boardPanel.getComponents()) {
            if (component instanceof CellButton) {
                CellButton button = (CellButton) component;
                int row = button.getRow();
                int col = button.getCol();
                Cell cell = board.getCell(row, col);
                if (cell.isOpen()) {
                    if (cell.isMine()) {
                        button.setText("X");
                    } else {
                        button.setText(Integer.toString(board.getAdjacentMines(row, col)));
                    }
                    button.setEnabled(false);
                }
            }
        }
    }
}
