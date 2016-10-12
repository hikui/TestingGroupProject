package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangesStatementTests {

    private final String TWO = "2";
    private final String FOUR = "2, 2";
    private final String FIVE = "5";
    private final String NINE = "5, 2, 2";
    private final String TEN = "10";
    private final String ELEVEN = "10";
    private final String FIFTEEN = "10, 5";
    private final String TWENTY = "20";
    private final String THIRTY = "20, 10";
    private final String FORTY = "20, 20";
    private final String FIFTY = "50";
    private final String SEVENTY = "50, 20";
    private final String NINETY = "50, 20, 20";



    @Test
    public void test2() { assertEquals(Changes.calculate(2), TWO); }

    @Test
    public void test4() { assertEquals(Changes.calculate(4), FOUR); }

    @Test
    public void test5() { assertEquals(Changes.calculate(5), FIVE); }

    @Test
    public void test9() { assertEquals(Changes.calculate(9), NINE); }

    @Test
    public void test10() { assertEquals(Changes.calculate(10), TEN); }

    @Test
    public void test11() { assertEquals(Changes.calculate(11), ELEVEN); }

    @Test
    public void test15() { assertEquals(Changes.calculate(15), FIFTEEN); }

    @Test
    public void test20() { assertEquals(Changes.calculate(20), TWENTY); }

    @Test
    public void test30() { assertEquals(Changes.calculate(30), THIRTY); }

    @Test
    public void test40() { assertEquals(Changes.calculate(40), FORTY); }

    @Test
    public void test50() { assertEquals(Changes.calculate(50), FIFTY); }

    @Test
    public void test70() { assertEquals(Changes.calculate(70), SEVENTY); }

    @Test
    public void test90() { assertEquals(Changes.calculate(90), NINETY); }

}
