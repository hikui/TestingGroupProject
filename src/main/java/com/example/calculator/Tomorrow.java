package com.example.calculator;
/**
 * This script takes in a date and computes the date of the next day.
 * Earliest year accepted is 1753.
 *
 * SWEN90006 Group Project, Semester 2, 2016
 * Modified based on the C code provided in COMP20005 lectures
 * The University of Melbourne
 */

public class Tomorrow {
	private static final int JAN = 1;
	private static final int FEB = 2;
	private static final int MAR = 3;
	private static final int APR = 4;
	private static final int MAY = 5;
	private static final int JUN = 6;
	private static final int JUL = 7;
	private static final int AUG = 8;
	private static final int SEP = 9;
	private static final int OCT = 10;
	private static final int NOV = 11;
	private static final int DEC = 12;
	private static final int FEB_DAYS = 28;
	private static final int SHRT_MON = 30;
	private static final int LONG_MON = 31;
	private static final int MONTHS_PER_YEAR = 12;
	private static final int MIN_YEAR = 1753;
	private static final int EXIT_FAILURE = 1;

	public Tomorrow() {
	}

	public static String compute(int yyyy, int mm, int dd) {
		/* validate the given date */
		// year
		if (yyyy < MIN_YEAR) {
			throw new UnsupportedOperationException(
			  "Year should be greater than " + MIN_YEAR);
		}

		// month
		if (mm < 1 || mm > MONTHS_PER_YEAR) {
			throw new UnsupportedOperationException(
			  "Month should be between 1 and " + MONTHS_PER_YEAR);
		}

		// day
		int length_of_month;
		int length_of_feb = FEB_DAYS;
		if (yyyy % 4 == 0 && (yyyy % 100 != 0 || yyyy % 400 == 0)) {
			length_of_feb += 1;
		}
		if (mm == JAN || mm == MAR || mm == MAY || mm == JUL || mm == AUG || mm == OCT
		    || mm == DEC) {
			length_of_month = LONG_MON;
		} else if (mm == APR || mm == JUN || mm == SEP || mm == NOV) {
			length_of_month = SHRT_MON;
		} else {
			length_of_month = length_of_feb;
		}
		if (dd < 1 || dd > length_of_month) {
			throw new UnsupportedOperationException(
			  "Day should be between 1 and " + length_of_month);
		}

		/* print out the given date */
		System.out.format("Date today is    %02d/%02d/%04d%n", dd, mm, yyyy);

		/* increase by one */
		dd += 1;

		/* check for month-end roll-over */
		if (dd > length_of_month) {
			dd = 1;
			mm += 1;
		}
		/* check for year-end roll-over */
		if (mm > MONTHS_PER_YEAR) {
			mm = 1;
			yyyy += 1;
		}

		/* print the date of next day */
		System.out.format("Date tomorrow is %02d/%02d/%04d%n", dd, mm, yyyy);
		return String.format("%02d/%02d/%04d", dd, mm, yyyy);

	}

}
