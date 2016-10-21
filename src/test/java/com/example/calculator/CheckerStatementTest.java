package com.example.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhou on 2016/10/20.
 */
public class CheckerStatementTest {
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

   // valid move
   @Test
   public void testMove_3() throws Exception {
       String str = "move to (" + 4 + "," + 4+ ")." ;
       assertEquals(new Checker(false,3,5).move(1,-1),str);
   }
    @Test
    public void testMove_4() throws Exception {
        String str = "move to (" + 2 + "," + 6+ ")." ;
        assertEquals(new Checker(true,3,5).move(-1,1),str);
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