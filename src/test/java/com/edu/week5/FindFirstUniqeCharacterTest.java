package com.edu.week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFirstUniqeCharacterTest {

    @Test
    void FindFirstUniqueCharacter(){
        String input = "success";
        char expected = 'u';
        char actual = FindFirstUniqeCharacter.findFirstNonRepeatedCharacter(input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void FindFirstUniqueCharacterInTheWord(){
        String input = "abba";
        char expected = ' ';
        char actual = FindFirstUniqeCharacter.findFirstNonRepeatedCharacter(input);
        Assertions.assertEquals(expected,actual);
    }


}