package com.edu.week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoshImplementationTest {
   // JoshImplementation string;
    String input;
//    @BeforeEach
//    void setUp(){
//   string = new JoshImplementation();
//    }

    @Test
    void happyPath(){
        input = "success";
        char result = JoshImplementation.findFirstNonRepeatedCharacter(input);
        assertEquals('u',result);
    }

    @Test
    void unHappyPath(){
        input = "success";
        char result = JoshImplementation.findFirstNonRepeatedCharacter(input);
        assertNotEquals('x',result);
    }
    @Test
    void checkNumbersAndSpecialCharsInString(){
        input = "^&*$$((yur";
        char result = JoshImplementation.findFirstNonRepeatedCharacter(input);
        assertEquals('y', result);
    }

    @Test
    void emptyString(){
        input = "";
        char result = JoshImplementation.findFirstNonRepeatedCharacter(input);
        assertEquals(' ', result);
    }
    @Test
    void emptyStringAsli(){
        input = "";
       assertThrows(IllegalArgumentException.class,()->{
           FindFirstUniqueCharacter_Stream_Asli_Optional_NullHandleRegex.findFirstNonRepeatedChar(null);
       }, "Input string cannot be null or empty.");
    }
    @Test
    void dublicateLettersString(){
        input = "YYYYY";
        char result = JoshImplementation.findFirstNonRepeatedCharacter(input);
        assertEquals(' ', result);
    }

    @Test
    void checkException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            JoshImplementation.findFirstNonRepeatedCharacter(null);
        }, "This string can not be null");
    }
}
