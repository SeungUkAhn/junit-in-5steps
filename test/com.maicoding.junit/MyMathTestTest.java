package com.maicoding.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTestTest {

    private MyMath math = new MyMath();

    @Test
    void testThreeMemberArray(){
        assertEquals(6, math.calculateSum(new int[] {1,2,3}));
    }

    @Test
    void testZeroLengthArray(){
        assertEquals(0, math.calculateSum(new int[] {}));
    }
}