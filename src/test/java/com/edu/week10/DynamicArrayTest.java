package com.edu.week10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
    DynamicArray dynamicArray = new DynamicArray<>();

    @Test
    void addingNewArray() {
        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i);
        }
        int actualDynamicArray = dynamicArray.size();
        int expectedDynoArray = 20;
        Assertions.assertEquals(expectedDynoArray,actualDynamicArray);

    }
}