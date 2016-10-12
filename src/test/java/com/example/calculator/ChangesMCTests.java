package com.example.calculator;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChangesMCTests {

    private final String ZERO = "";
    private final String ONE = "";
    private final String TWO = "2";
    private final String THREE = "2";
    private final String FOUR = "2, 2";
    private final String FIVE = "5";
    private final String SEVEN = "5, 2";
    private final String EIGHT = "5, 2";
    private final String NINE = "5, 2, 2";
    private final String TEN = "10";
    private final String ELEVEN = "10";
    private final String TWELVE = "10, 2";
    private final String THIRTEEN = "10, 2";
    private final String FOURTEEN = "10, 2, 2";
    private final String FIFTEEN = "10, 5";
    private final String SIXTEEN = "10, 5";
    private final String SEVENTEEN = "10, 5, 2";
    private final String EIGHTEEN = "10, 5, 2";
    private final String NINETEEN = "10, 5, 2, 2";
    private final String TWENTY = "20";
    private final String THIRTY = "20, 10";
    private final String FORTY = "20, 20";
    private final String FIFTY = "50";
    private final String SEVENTY = "50, 20";
    private final String EIGHTY = "50, 20, 10";
    private final String NINETY = "50, 20, 20";
    private final String ONE_HUNDRED = "";

    @Test
    public void test0() { assertEquals(Changes.calculate(0), ZERO); }

    @Test
    public void test1() { assertEquals(Changes.calculate(1), ONE); }

    @Test
    public void test2() { assertEquals(Changes.calculate(2), TWO); }

    @Test
    public void test3() { assertEquals(Changes.calculate(3), THREE); }

    @Test
    public void test4() { assertEquals(Changes.calculate(4), FOUR); }

    @Test
    public void test5() { assertEquals(Changes.calculate(5), FIVE); }

    @Test
    public void test7() { assertEquals(Changes.calculate(7), SEVEN); }

    @Test
    public void test8() { assertEquals(Changes.calculate(8), EIGHT); }

    @Test
    public void test9() { assertEquals(Changes.calculate(9), NINE); }

    @Test
    public void test10() { assertEquals(Changes.calculate(10), TEN); }

    @Test
    public void test11() { assertEquals(Changes.calculate(11), ELEVEN); }

    @Test
    public void test12() { assertEquals(Changes.calculate(12), TWELVE); }

    @Test
    public void test13() { assertEquals(Changes.calculate(13), THIRTEEN); }

    @Test
    public void test14() { assertEquals(Changes.calculate(14), FOURTEEN); }

    @Test
    public void test15() { assertEquals(Changes.calculate(15), FIFTEEN); }

    @Test
    public void test16() { assertEquals(Changes.calculate(16), SIXTEEN); }

    @Test
    public void test17() { assertEquals(Changes.calculate(17), SEVENTEEN); }

    @Test
    public void test18() { assertEquals(Changes.calculate(18), EIGHTEEN); }

    @Test
    public void test19() { assertEquals(Changes.calculate(19), NINETEEN); }

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
    public void test80() { assertEquals(Changes.calculate(80), EIGHTY); }

    @Test
    public void test90() { assertEquals(Changes.calculate(90), NINETY); }

    @Test
    public void test100() { assertEquals(Changes.calculate(100), ONE_HUNDRED); }



}
