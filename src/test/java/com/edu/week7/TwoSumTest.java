package com.edu.week7;

import com.edu.week6.ArrayReduction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void happyPath(){
        int [] tt = {2,7,11,15};
        int [] actualResult = TwoSum.twoSum2(tt,9);
        int [] expected = {1, 0};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actualResult));
    }

    @Test
    void unhappyPath(){
        int [] tt = {2,7,11,15};
        int [] actualResult = TwoSum.twoSum2(tt,9);
        int [] expected = {1, 1};
        Assertions.assertNotEquals(Arrays.toString(expected), Arrays.toString(actualResult));
    }

    @Test
    void emptyArray(){
        int [] tt = {};
        int [] actualResult = TwoSum.twoSum2(tt,9);
        int [] expected = {};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actualResult));
    }
    @Test
    void checkException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            ArrayReduction.arrayReductionCost(null);
        }, "This array can not be null");
    }

}