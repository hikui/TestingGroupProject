package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HeguangMiao on 28/09/2016.
 * Edited by Dongge Liu on 30/09/2016.
 */
public class CalculatorStatementTests {
	@Test
	public void test() throws UnsupportedOperatorException {
		assertEquals(Calculator.evaluate("(1+1)*3/4"), 1.5, 0);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testDevideByZero() throws UnsupportedOperatorException {
        Calculator.evaluate("3/0");
    }

    @Test
    public void testCalculator() throws UnsupportedOperatorException {
        String str = " 100-(20-30*(1+2)/3)";
        assertEquals(Calculator.evaluate(str), 110, 0);
    }

    @Test(expected = UnsupportedOperatorException.class)
    public void testUnsupportedOperator() throws UnsupportedOperatorException {
        Calculator.evaluate("a");
    }
}
