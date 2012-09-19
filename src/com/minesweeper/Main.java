package com.minesweeper;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** Main frame that houses the rest of the visual components for the game. */
public class Main extends JFrame {

    /** A table of Cells that hold this game's state. */
    private ArrayList<ArrayList<Cell>> boardCells;
    
    /** Main method. */
    public static void main(String[] args) {
	new Main();
    }

    /** Create a new JFrame. */
    public Main() {
	super("Minesweeper");
	add(new JLabel("A test label, yo! Yep..."));

	// TODO: Here, add a bunch of randomly-generated Cells to boardCells.
	pack();
	setVisible(true);
    }	    
}


/*
  So I want a class that represents a cell on the board.
  That cell will have a field that indicates whether it:
    * Is a mine.
    * Has 1/2/3/.../8 mines neighboring it.
    * Whether it has been clicked or not. */