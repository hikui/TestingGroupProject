package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HeguangMiao on 17/10/2016.
 */
public class CalculatorMCTests {
    @Test
    public void testA() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate(" 0"), 0, 0);
    }

    @Test
    public void testB() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("1+2"), 3 ,0);
    }

    @Test(expected = UnsupportedOperatorException.class)
    public void testC() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("1+a"), 3 ,0);
    }

    @Test
    public void testD() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("(1+2)"), 3, 0);
    }

    @Test
    public void testE() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("3+4*2"), 11, 0);
    }

    @Test
    public void testF() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("3-4*2"), -5, 0);
    }

    @Test
    public void testG() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("2+4/2"), 4, 0);
    }
    @Test
    public void testH() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("4-2/2"), 3, 0);
    }
    @Test
    public void testI() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("4*4*4"), 64, 0);
    }
    @Test
    public void testJ() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("4*2/4"), 2, 0);
    }
    @Test
    public void testK() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("1+2+3"), 6, 0);
    }
    @Test
    public void testL() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("2-1+3"), 4, 0);
    }
    @Test
    public void testM() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("4*3+1"), 13, 0);
    }
    @Test
    public void testN() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("2*(4+1)"), 10, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testO() throws UnsupportedOperatorException {
        Calculator.evaluate("3/0");
    }


}
