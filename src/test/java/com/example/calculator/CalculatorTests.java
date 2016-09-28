package com.example.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HeguangMiao on 28/09/2016.
 */
public class CalculatorTests {
    @Test
    public void test() throws UnsupportedOperatorException {
        assertEquals(Calculator.evaluate("(1+1)*3/4"), 1.5, 0);
    }
}
