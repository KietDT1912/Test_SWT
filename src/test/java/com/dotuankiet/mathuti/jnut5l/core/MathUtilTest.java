/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotuankiet.mathuti.jnut5l.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AdMins
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
    
    @Test
    public void testFactorialGivenRightArgument_ReturnsGoodResult(){
        assertEquals(120, MathUtil.getFactorial(5));
        assertEquals(720, MathUtil.getFactorial(6));
    }
    @Test
    public void testFactorialGivenWrongArgument_ThrowsException(){
       // assertThrows(expectedType, executable); //Lambda Expression
    }
    
}
