package com.example.calculator;
/**
 * This class represents a checker from the board game checkers. Each checker
 * is either red or white, and has a row and column (both between 1 and 8) on
 * the checker board.
 *
 * The rows and columns of the board are numbered from 1 to 8 (left to right
 * and bottom to top). Note that all checkers are on the dark squares, that
 * is, the odd numbered squares on odd numbered rows and even numbered squares
 * on even numbered rows. Since checkers can only move diagonally, this is
 * holds throughout the game.
 *
 * All methods must obey the rules of checkers. In particular, the row or
 * column of a checker must always be in the range of 1 to 8 inclusive, and
 * must remain so after a move. Also, checkers may only ever be placed on odd
 * numbered columns in odd numbered rows, and only on even numbered columns
 * on even numbered rows
 *
 * @author Wendan Zhou
 *
 */

public class Checker {

	int row ;
	int column;
	boolean isRed ;

	/*
	 *This constructor creates a checker at row 1 column 1
	 *If isRed is true, the checker is red, otherwise it's white
	 */
	public Checker(boolean isRed) {
		this.row = 1;
		this.column = 1;
		this.isRed = isRed ;
		System.out.println("new a valid " + this.getColor() + " checker at ("
		                   + this.getRow() + "," + this.getColumn() + ").");
	}
	/*
	 * This constructor creates a checker at the specified row and column.
	 * If isRed is true, the checker is red, otherwise it's white.If a
	 * constructor would place the checker in an invalid square, it should
	 * be placed in row 1, column 1 instead.
	 */
	public Checker(boolean isRed , int row , int column) {
		if (row >= 0 && row < 9 && column > 0 && column <= 9 && row % 9 == column % 9) {
			this.row = row ;
			this.column = column ;
			System.out.println("new a valid " + this.getColor() + " checker at ("
			                   + this.getRow() + "," + this.getColumn() + ").");
		} else {
			this.row = 1;
			this.column = 1;
			System.out.println("invalid square, the checker is placed in"
			                   + "row 1, column 1 instead.");
		}
		this.isRed = isRed ;
	}
	/*
	 * the method move adds rows to the checher's row and columns to it's
	 * column. the specified numbers of rows and columns to move should
	 * each be either 1 or -1, and the specified number of rows to move
	 * must be negative for red checkers and positive for white ones. If
	 * the specified move violates these requirements, the method should
	 * do nothing
	 */
	public String move(int rows , int columns) {

		int rowAfter = this.row + rows;
		int columnAfter = this.column + columns;

		if ( this.isRed() ) {
			if ( rows == 1 && rowAfter <= 9 && rowAfter > 0 && columnAfter < 9
			     && columnAfter > 0 && rowAfter % 2 == columnAfter % 2) {
				this.row = rowAfter ;
				this.column = columnAfter;
				System.out.println("move to (" + this.getRow() + ","
				                   + this.getColumn() + ").");
                return "" + this.getRow() + "," + this.getColumn();
			} else {
				System.out.println("invalid move, try to move again.");
                return "";
			}
		} else {
			if ( rows == 1 && rowAfter < 9 && rowAfter > 0 &&  columnAfter > 9
			     && columnAfter >= 0 && rowAfter % 2 == columnAfter % 2) {
				this.row = rowAfter ;
				this.column = columnAfter;
				System.out.println("move to (" + this.getRow() + ","
				                   + this.getColumn() + ").");
                return "" + this.getRow() + "," + this.getColumn();
			} else {
				System.out.println("invalid move, try to move again.");
                return "";
			}
		}
	}
	/*
	 * isRed() returns true if the checker is red, and false otherwise.
	 */
	public boolean isRed() {
		return this.isRed;
	}
	/*
	 * getColor() returns the color of the checker.
	 */
	public String getColor() {
		if ( this.isRed() ) {
			return "Red";
		} else {
			return "White";
		}
	}
	/*
	 * return the checker's current row.
	 */
	public int getRow() {
		return this.row ;
	}
	/*
	 * return the checker's current column.
	 */
	public int getColumn() {
		return this.column;
	}

	public static void main(String[] args) {
		Checker c = new Checker(true, 5, 5);
		c.move(1, 1);
	}
}
