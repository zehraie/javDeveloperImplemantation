package com.edu.week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static com.edu.week4.MultiplyOfArrayElement_Stream.updateArray;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyOfArrayElements2Test {
  @Test
          void checkMultiplicationOfArray01() {
      int[] inputValue = {2, 3, 4, 5, 6};
      int[] expectedResult = {6, 8, 15, 24, 30};
      int[] actualresult = MultiplyOfArrayElements.updateArray(inputValue);
     // Assertions.assertEquals(Arrays.toString(expectedResult),Arrays.toString(actualresult));
      Assertions.assertArrayEquals(expectedResult,actualresult);
      Assertions.assertTrue(Arrays.equals(expectedResult,actualresult));
  }
    @Test
    void checkMultiplicationOfArray02() {
        int[] inputValue = {2};
        int[] expectedResult = {2};
        int[] actualresult = MultiplyOfArrayElements.updateArray(inputValue);
        // Assertions.assertEquals(Arrays.toString(expectedResult),Arrays.toString(actualresult));
        Assertions.assertArrayEquals(expectedResult,actualresult);
        Assertions.assertTrue(Arrays.equals(expectedResult,actualresult));
    }


        @Test
        public void testUpdateArrayWithNullArray() {
            int[] numArray = null;
            try {
                int[] result = updateArray(numArray);
                Assertions.fail("Expected IllegalArgumentException, but no exception was thrown");
            } catch (IllegalArgumentException e) {
                Assertions.assertEquals("Array can not be null value", e.getMessage());
            }
        }

        // Arrays.deepEquals(expectedResult, actualResult); comparing dimentional array and objects

    @Test
    void checkMultiplicationOfArray_Streem() {
        int[] inputValue = {2, 3, 4, 5, 6};
        int[] expectedResult = {6, 8, 15, 24, 30};
        int[] actualresult = MultiplyOfArrayElement_Stream.updateArray(inputValue);
        // Assertions.assertEquals(Arrays.toString(expectedResult),Arrays.toString(actualresult));
        Assertions.assertArrayEquals(expectedResult,actualresult);
        Assertions.assertTrue(Arrays.equals(expectedResult,actualresult));
    }
    }



