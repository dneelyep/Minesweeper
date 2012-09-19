package com.minesweeper;

import javax.swing.JButton;

public class Cell extends JButton {

    /** Whether or not this Cell is a mine. */
    private Boolean isMine;

    /** The number of mines that neighbor this Cell. */
    private int numMineNeighbors;
    
    /** Construct a new Cell, depending on whether
     *  or not the Cell is a mine. */
    public Cell(Boolean isAMine) {
	isMine = isAMine;
    }
}