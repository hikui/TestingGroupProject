package com.example.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.example.calculator.Tomorrow.*;
import static org.junit.Assert.*;

/**
 * Created by Zhou on 2016/10/21.
 */
public class TomorrowStatementTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }
// invalid year
    @Test(expected = UnsupportedOperationException.class)
    public void testCompute_1() throws UnsupportedOperationException {
      Tomorrow.compute(1700, 2, 14);
    }
// invalid month
    @Test(expected = UnsupportedOperationException.class)
    public void testCompute_2() throws UnsupportedOperationException {
        Tomorrow.compute(1800, 0, 14);
    }
//    @Test(expected = UnsupportedOperationException.class)
//    public void testCompute_22() throws UnsupportedOperationException {
//        Tomorrow.compute(1800, 15, 14);
//    }

    // invalid date  Long month
    @Test(expected = UnsupportedOperationException.class)
    public void testCompute_3() throws UnsupportedOperationException {
        Tomorrow.compute(2015, 10, 0);
    }
//    @Test(expected = UnsupportedOperationException.class)
//    public void testCompute_33() throws UnsupportedOperationException {
//        Tomorrow.compute(2015, 10, 40);
//    }

    // invalid date  Short month
    @Test(expected = UnsupportedOperationException.class)
    public void testCompute_4() throws UnsupportedOperationException {
        Tomorrow.compute(2015, 4, -1);
    }
//    @Test(expected = UnsupportedOperationException.class)
//    public void testCompute_44() throws UnsupportedOperationException {
//        Tomorrow.compute(2015, 4, 31);
//    }
    // invalid date  February
    @Test(expected = UnsupportedOperationException.class)
    public void testCompute_5() throws UnsupportedOperationException {
        Tomorrow.compute(2000, 2, -7);
    }
//    @Test(expected = UnsupportedOperationException.class)
//    public void testCompute_55() throws UnsupportedOperationException {
//        Tomorrow.compute(2000, 2, 30);
//    }

// valid date
    @Test
    public void testCompute_6() throws UnsupportedOperationException {
        assertEquals(Tomorrow.compute(2016, 10, 21),String.format("%02d/%02d/%04d", 22, 10, 2016));
    }
    @Test  //month-end roll-over
    public void testCompute_7() throws UnsupportedOperationException {
        assertEquals(Tomorrow.compute(2016, 10, 31),String.format("%02d/%02d/%04d", 1, 11, 2016));
    }
    @Test  //year-end roll-over
    public void testCompute_8() throws UnsupportedOperationException {
        assertEquals(Tomorrow.compute(2016, 12, 31),String.format("%02d/%02d/%04d", 1, 1, 2017));
    }
}