package com.edu.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingDublicateTest {

    @Test
    void dupChars() {
         String str = "indivisibility";
         int i = 1;
        Assertions.assertEquals(i, OtherSolutions.dupChars(str));
    }
    @Test
    void dupChars2() {
        String str = "fFgf";
        int i = 1;
        Assertions.assertEquals(i, OtherSolutions.dupChars(str));
    }
    @Test
    void dupChars3() {
        String str = "fFgfttt";
        int i = 2;
        Assertions.assertEquals(i, OtherSolutions.dupChars(str));
    }


}