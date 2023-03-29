package com.javarush.minesweeper;

public class Cell {
    private boolean isMine;
    private boolean isOpen;

    public Cell(boolean isMine) {
        this.isMine = isMine;
        this.isOpen = false;
    }

    public boolean isMine() {
        return isMine;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = true;
    }

    public void setMine() {
        isMine = true;
    }

}

