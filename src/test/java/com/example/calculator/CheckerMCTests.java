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
    public void testMove_11() throws Exception {
        new Checker(true,3,3).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12() throws Exception {
        new Checker(false,3,3).move(-1,1);
    }

    /**
     *     invalid move (reason: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_21() throws Exception {
        new Checker(true,1,1).move(-1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_22() throws Exception {
        new Checker(true,8,8).move(-1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_23() throws Exception {
        new Checker(true,8,1).move(-1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_27() throws Exception {
        new Checker(true,1,1).move(-1,-1);
    }


    @Test(expected = Exception.class)
    public void testMove_24() throws Exception {
        new Checker(false,1,1).move(1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_25() throws Exception {
        new Checker(false,8,8).move(1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_26() throws Exception {
        new Checker(false,6,8).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_28() throws Exception {
        new Checker(false,8,8).move(1,1);
    }
    /**
     *     invalid move (reason: after moving, rowAfter % 2 != columnAfter % 2)
     */
    @Test(expected = Exception.class)
    public void testMove_31() throws Exception {
        new Checker(true,8,6).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_32() throws Exception {
        new Checker(false,5,3).move(-1,2);
    }

    /**
     *     invalid move (reason1: the specified number of rows to move must be
     *     negative for red checkers and positive for white ones)
     *     reason2: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_12_1() throws Exception {
        new Checker(true,8,1).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_2() throws Exception {
        new Checker(true,6,8).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_3() throws Exception {
        new Checker(true,1,1).move(1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_4() throws Exception {
        new Checker(false,1,1).move(-1,-1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_5() throws Exception {
        new Checker(false,8,8).move(-1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_6() throws Exception {
        new Checker(false,5,1).move(-1,-1);
    }

    @Test(expected = Exception.class)
    public void testMove_12_7() throws Exception {
        new Checker(true,8,8).move(1,1);
    }
    @Test(expected = Exception.class)
    public void testMove_12_8() throws Exception {
        new Checker(false,1,1).move(-1,-1);
    }

    /**
     *     invalid move (reason1: after moving, rowAfter % 2 != columnAfter % 2)
     *     reason2: after moving, the checker is not on board)
     */
    @Test(expected = Exception.class)
    public void testMove_23_1() throws Exception {
        new Checker(true,1,1).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_2() throws Exception {
        new Checker(true,8,8).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_3() throws Exception {
        new Checker(true,8,2).move(-1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_7() throws Exception {
        new Checker(true,1,2).move(-1,-2);
    }

    @Test(expected = Exception.class)
    public void testMove_23_4() throws Exception {
        new Checker(false,1,1).move(1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_5() throws Exception {
        new Checker(false,8,6).move(1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_6() throws Exception {
        new Checker(false,5,7).move(1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_23_8() throws Exception {
        new Checker(false,8,8).move(1,2);
    }

    /**
     *     invalid move (reason1: after moving, rowAfter % 2 != columnAfter % 2)
     *     reason2: after moving, the checker is not on board)
     *     reason3: the specified number of rows to move must be
     *     negative for red checkers and positive for white ones)
     */
    @Test(expected = Exception.class)
    public void testMove_123_1() throws Exception {
        new Checker(true,8,2).move(1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_2() throws Exception {
        new Checker(true,6,8).move(1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_3() throws Exception {
        new Checker(true,1,1).move(1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_7() throws Exception {
        new Checker(true,8,8).move(1,2);
    }

    @Test(expected = Exception.class)
    public void testMove_123_4() throws Exception {
        new Checker(false,1,1).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_5() throws Exception {
        new Checker(false,8,8).move(-1,2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_6() throws Exception {
        new Checker(false,8,2).move(-1,-2);
    }
    @Test(expected = Exception.class)
    public void testMove_123_8() throws Exception {
        new Checker(false,1,1).move(-1,-2);
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
    //others
    @Test
    public void isRed_1() throws Exception {
        assertEquals(new Checker(true).isRed(),true);
    }
    @Test
    public void isRed_2() throws Exception {
        assertEquals(new Checker(true,1,1).isRed(),true);
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
    public void getColor_3() throws Exception {
        assertEquals(new Checker(true,1,1).getColor(),"Red");
    }
    @Test
    public void getColor_4() throws Exception {
        assertEquals(new Checker(false,1,1).getColor(),"White");
    }
    @Test
    public void getRow_1() throws Exception {
        assertEquals(new Checker(false,1,3).getRow(),1);
    }
    @Test
    public void getColumn_1() throws Exception {
        assertEquals(new Checker(false,4,6).getColumn(),6);
    }
    @Test
    public void getRow_2() throws Exception {
        assertEquals(new Checker(false).getRow(),1);
    }
    @Test
    public void getColumn_2() throws Exception {
        assertEquals(new Checker(false).getColumn(),1);
    }
    @Test
    public void getRow_3() throws Exception {
        assertEquals(new Checker(false,-1,1).getRow(),1);
    }
    @Test
    public void getColumn_3() throws Exception {
        assertEquals(new Checker(false,-1,1).getColumn(),1);
    }
    @Test
    public void getRow_4() throws Exception {
        assertEquals(new Checker(false,1,2).getRow(),1);
    }
    @Test
    public void getColumn_4() throws Exception {
        assertEquals(new Checker(false,1,2).getColumn(),1);
    }
    @Test
    public void getRow_5() throws Exception {
        assertEquals(new Checker(false,9,1).getRow(),1);
    }
    @Test
    public void getColumn_5() throws Exception {
        assertEquals(new Checker(false,9,1).getColumn(),1);
    }
    @Test
    public void getRow_6() throws Exception {
        assertEquals(new Checker(false,5,-1).getRow(),1);
    }
    @Test
    public void getColumn_6() throws Exception {
        assertEquals(new Checker(false,5,-1).getColumn(),1);
    }

    @Test
    public void getRow_8() throws Exception {
        assertEquals(new Checker(false,5,9).getRow(),1);
    }
    @Test
    public void getColumn_8() throws Exception {
        assertEquals(new Checker(false,5,9).getColumn(),1);
    }
}
