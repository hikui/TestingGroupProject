package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HeguangMiao on 18/10/2016.
 */
public class TomorrowMCTests {

    @Test(expected = UnsupportedOperationException.class)
    public void testA() {
        Tomorrow.compute(1752, 1, 1);
    }

    @Test
    public void testMonthValidation1() {
        assertEquals(Tomorrow.compute(1990,2,28),"01/03/1990");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMonthValidation2() {
        Tomorrow.compute(1990,0,28);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMonthValidation3() {
        Tomorrow.compute(1990,13,28);
    }
}
