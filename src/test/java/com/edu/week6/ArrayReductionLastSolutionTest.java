package com.edu.week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayReductionLastSolutionTest {

    @Test
    void happyPath(){
        int [] tt = {4,6,8};
        int actualResult = ArrayReductionLastSolution.reduceSum(tt);
        Assertions.assertEquals(28,actualResult);
    }

    @Test
    void unhappyPath(){
        int [] tt = {4,6,8};
        int actualResult = ArrayReductionLastSolution.reduceSum(tt);
        Assertions.assertNotEquals(8,actualResult);
    }

    @Test
    void emptyArray(){
        int [] tt = {};
        int actualResult = ArrayReductionLastSolution.reduceSum(tt);
        Assertions.assertEquals(0,actualResult);
    }
    @Test
    void checkException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            ArrayReductionLastSolution.reduceSum(null);
        }, "This array can not be null");
    }

}
