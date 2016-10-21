package com.example.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zhou on 2016/10/18.
 */
public class CheckerMCTests {
    /**
     *     invalid move (reason: the specified number of rows to move must be
     *     negative for red checkers and positive for white ones
     */
    @Test(expected = Exception.class)
    public void testMove_1() throws Exception {
        new Checker(true,3,3).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_2() throws Exception {
        new Checker(false,3,3).move(-1,1);
    }

    /**
     *     invalid move (reason: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_3() throws Exception {
        new Checker(true,1,1).move(-1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_4() throws Exception {
        new Checker(true,8,8).move(-1,1);
    }

    @Test(expected = Exception.class)
    public void testMove_5() throws Exception {
        new Checker(false,1,1).move(1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_6() throws Exception {
        new Checker(false,8,8).move(1,-1);
    }
    /**
     *     invalid move (reason: after moving, rowAfter % 2 != columnAfter % 2)
     */
    @Test(expected = Exception.class)
    public void testMove_7() throws Exception {
        new Checker(true,8,6).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_8() throws Exception {
        new Checker(false,5,3).move(-1,2);
    }

    // valid move
    @Test
    public void testMove_9() throws Exception {
        String str = "move to (" + 4 + "," + 4+ ")." ;
        assertEquals(new Checker(false,3,5).move(1,-1),str);
    }
    @Test
    public void testMove_10() throws Exception {
        String str = "move to (" + 2 + "," + 6+ ")." ;
        assertEquals(new Checker(true,3,5).move(-1,1),str);
    }

    /**
     *     invalid move (reason1: the specified number of rows to move must be
     *     negative for red checkers and positive for white ones)
     *     reason2: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_11() throws Exception {
        new Checker(true,8,1).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12() throws Exception {
        new Checker(true,8,8).move(1,1);
    }

    @Test(expected = Exception.class)
    public void testMove_13() throws Exception {
        new Checker(false,1,1).move(-1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_14() throws Exception {
        new Checker(false,8,8).move(-1,1);
    }

    /**
     *     invalid move (reason1: after moving, rowAfter % 2 != columnAfter % 2)
     *     reason2: after moving, the checker is not on board)
     *     reason3: the specified number of rows to move must be
     *     negative for red checkers and positive for white ones)
     */
    @Test(expected = Exception.class)
    public void testMove_15() throws Exception {
        new Checker(true,8,2).move(1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_16() throws Exception {
        new Checker(true,8,8).move(1,2);
    }

    @Test(expected = Exception.class)
    public void testMove_17() throws Exception {
        new Checker(false,1,1).move(-1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_18() throws Exception {
        new Checker(false,8,8).move(-1,2);
    }

    /**
     *     invalid move (reason1: after moving, rowAfter % 2 != columnAfter % 2)
     *     reason2: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_19() throws Exception {
        new Checker(true,1,1).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_20() throws Exception {
        new Checker(true,8,8).move(-1,2);
    }

    @Test(expected = Exception.class)
    public void testMove_21() throws Exception {
        new Checker(false,1,1).move(1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_22() throws Exception {
        new Checker(false,8,8).move(1,2);
    }




    @Test
    public void isRed() throws Exception {
        assertEquals(new Checker(true).isRed(),true);
    }
    @Test
    public void getColor_1() throws Exception {
        assertEquals(new Checker(true).getColor(),"Red");
    }
    @Test
    public void getColor_2() throws Exception {
        assertEquals(new Checker(false).getColor(),"White");
    }
    @Test
    public void getRow() throws Exception {
        assertEquals(new Checker(false,1,3).getRow(),1);
    }
    @Test
    public void getColumn() throws Exception {
        assertEquals(new Checker(false,4,6).getColumn(),6);
    }

}
