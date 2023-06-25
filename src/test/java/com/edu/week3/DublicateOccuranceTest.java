package com.edu.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DublicateOccuranceTest {

    @Test
    void dipChars() {
        String str = "indivisibility";
        int i = 1;
        Assertions.assertEquals(i, DublicateOccurance.dipChars(str));
    }

    @Test
    void dipChars3() {
        String str = "fFgfttt";
        int i = 2;
        Assertions.assertEquals(i, DublicateOccurance.dipChars(str));
    }
}