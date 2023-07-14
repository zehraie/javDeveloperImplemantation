package com.edu.week5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstUniqueCharacter_Stream_Asli_Optional_NullHandleRegex {

    public static void main(String[] args) {

//        String str = null; // or assign a non-null value
//        if (str != null) {
//            char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
//            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
//        } else {
//            System.out.println("Input string is null.");
//        }

        String str = null;
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);

        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }

    public static char findFirstNonRepeatedChar(String str){
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Input string must contain only alphabetic characters.");
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        str.chars().forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));

        Optional<Character> firstNonRepeatedChar = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        return firstNonRepeatedChar.orElse('\0');//Note that '\0' is the representation of the null character.
    }
}
