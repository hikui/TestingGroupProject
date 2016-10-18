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

    @Test
    public void testLeapYear1() {
        assertEquals(Tomorrow.compute(1840, 2, 28), "29/02/1840");
    }

    @Test
    public void testLeapYear2() {
        assertEquals(Tomorrow.compute(4000, 2, 28), "29/02/4000");
    }

    @Test
    public void testLeapYear3() {
        assertEquals(Tomorrow.compute(2004, 2, 28), "29/02/2004");
    }

    @Test
    public void testLeapYear4() {
        assertEquals(Tomorrow.compute(1990, 2, 28), "01/03/1990");
    }

    @Test
    public void testDifferentMonths1() {
        assertEquals(Tomorrow.compute(1990, 1, 30), "31/01/1990");
    }

    @Test
    public void testDifferentMonths3() {
        assertEquals(Tomorrow.compute(1990, 3, 30), "31/03/1990");
    }

    @Test
    public void testDifferentMonths4() {
        assertEquals(Tomorrow.compute(1990, 4, 30), "01/05/1990");
    }

    @Test
    public void testDifferentMonths5() {
        assertEquals(Tomorrow.compute(1990, 5, 30), "31/05/1990");
    }

    @Test
    public void testDifferentMonths6() {
        assertEquals(Tomorrow.compute(1990, 6, 30), "01/07/1990");
    }

    @Test
    public void testDifferentMonths7() {
        assertEquals(Tomorrow.compute(1990, 7, 30), "31/07/1990");
    }

    @Test
    public void testDifferentMonths8() {
        assertEquals(Tomorrow.compute(1990, 8, 30), "31/08/1990");
    }

    @Test
    public void testDifferentMonths9() {
        assertEquals(Tomorrow.compute(1990, 9, 30), "01/10/1990");
    }

    @Test
    public void testDifferentMonths10() {
        assertEquals(Tomorrow.compute(1990, 10, 30), "31/10/1990");
    }

    @Test
    public void testDifferentMonths11() {
        assertEquals(Tomorrow.compute(1990, 11, 30), "01/12/1990");
    }

    @Test
    public void testDifferentMonths12() {
        assertEquals(Tomorrow.compute(1990, 12, 30), "31/12/1990");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDaysValidation1() {
        Tomorrow.compute(1990, 12, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDaysValidation2() {
        Tomorrow.compute(1990, 12, 32);
    }
}
