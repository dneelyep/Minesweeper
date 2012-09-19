package com.minesweeper;

import javax.swing.JFrame;
import javax.swing.JLabel;

/** Main frame that houses the rest of the visual components for the game. */
class Main extends JFrame {

    /** Main method. */
    public static void main(String[] args) {
	new Main();
    }

    /** Create a new JFrame. */
    public Main() {
	super("Minesweeper");

	this.add(new JLabel("A test label, yo!"));
	this.pack();
	this.setVisible(true);

	for (int i = 0; i < 10000000; i++) {
	}
    }	    
}
