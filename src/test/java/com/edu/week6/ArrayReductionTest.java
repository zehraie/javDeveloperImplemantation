package com.edu.week6;

import com.edu.week5.JoshImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class ArrayReductionTest {

    @Test
    void happyPath(){
        int [] tt = {4,6,8};
        int actualResult = ArrayReduction.arrayReductionCost(tt);
        Assertions.assertEquals(28,actualResult);
    }

     @Test
     void unhappyPath(){
         int [] tt = {4,6,8};
         int actualResult = ArrayReduction.arrayReductionCost(tt);
         Assertions.assertNotEquals(8,actualResult);
     }
     @Test
     void unhappyPath2(){
         int [] tt = {8};
         int actualResult = ArrayReduction.arrayReductionCost(tt);
         Assertions.assertEquals(0,actualResult);
     }
     @Test
     void unhappyPath3(){
         int [] tt = {8,10};
         int actualResult = ArrayReduction.arrayReductionCost(tt);
         Assertions.assertEquals(18,actualResult);
     }

     @Test
     void emptyArray(){
         int [] tt = {};
         int actualResult = ArrayReduction.arrayReductionCost(tt);
         Assertions.assertEquals(0,actualResult);
     }
     @Test
     void checkException(){
         assertThrows(IllegalArgumentException.class, ()-> {
             ArrayReduction.arrayReductionCost(null);
         }, "This array can not be null");
     }

}