package com.edu.week4;

import com.edu.week6.ArrayReduction;
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
        void checkException(){
                assertThrows(IllegalArgumentException.class, ()-> {
                    MultiplyOfArrayElements.updateArray(null);
                }, "This array can not be null");
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



