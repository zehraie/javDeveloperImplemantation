package com.edu.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DubOccuranceStreamTest {

    @Test
    void countDuplicateChars() {
        String str ="abcab";
        Assertions.assertEquals(2,DubOccuranceStream.countDuplicateChars(str));
    }
}