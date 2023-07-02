package com.edu.week3;

import com.edu.week3.DubOccuranceStream;
import com.edu.week3.DublicateOccurance;
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
        assertEquals(i, DublicateOccurance.dipChars(str));
    }

    static class DubOccuranceStreamTest {

        @Test
        void countDuplicateChars() {
            String str ="abcab";
            assertEquals(2, DubOccuranceStream.countDuplicateChars(str));
        }
    }
}