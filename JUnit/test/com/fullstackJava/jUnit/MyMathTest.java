package com.fullstackJava.jUnit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    public void calculateSum_threeMemberArray() {

        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));


    }
    @Test
    public void calculateSum_ZeroLengthArray() {

        assertEquals(0, math.calculateSum(new int[]{}));


    }
  
}