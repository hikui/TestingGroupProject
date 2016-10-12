package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HeguangMiao on 28/09/2016.
 * Edited by Dongge Liu on 30/09/2016.
 */
public class CalculatorTests {
	@Test
	public void test() throws UnsupportedOperatorException {
		assertEquals(Calculator.evaluate("(1+1)*3/4"), 1.5, 0);
	}

//	@Test
//	public void test2() {
//		assertEquals(EightQueens.enumerate(2), 4);
//	}
//
//	@Test
//	public void test3() {
//		assertEquals(Tomorrow.compute(2016, 2, 27), "2822016");
//	}
//
//	@Test
//	public void test4() {
//		Checker c = new Checker(true, 5, 5);
//		assertEquals(c.move(1,1), "6,6");
//	}
}
