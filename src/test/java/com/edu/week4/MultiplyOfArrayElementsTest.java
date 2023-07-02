package com.edu.week4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplyOfArrayElementsTest {
    /**
     * Method under test: {@link MultiplyOfArrayElements#updateArray(int[])}
     */
    @Test
    void testUpdateArray() {
        int[] actualUpdateArrayResult = MultiplyOfArrayElements.updateArray(new int[]{10, 1, 10, 1});
        assertEquals(4, actualUpdateArrayResult.length);
        assertEquals(10, actualUpdateArrayResult[0]);
        assertEquals(100, actualUpdateArrayResult[1]);
        assertEquals(1, actualUpdateArrayResult[2]);
        assertEquals(10, actualUpdateArrayResult[3]);
    }

    /**
     * Method under test: {@link MultiplyOfArrayElements#updateArray(int[])}
     */
    @Test
    void testUpdateArray2() {
        assertEquals(0, MultiplyOfArrayElements.updateArray(new int[]{}).length);
    }
}

