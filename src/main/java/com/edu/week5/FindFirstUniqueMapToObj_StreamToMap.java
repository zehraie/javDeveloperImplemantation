package com.edu.week5;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstUniqueMapToObj_StreamToMap {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharInString("Peki"));
    }

    public static char firstUniqueCharInString(String str) {
        Map<Character, Long> charElements = str.chars()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(charElements);

        Optional<Character> firstUniqueChar = charElements.entrySet()
                .stream().filter(c -> c.getValue() == 1)
                .map(c->c.getKey())
                .findFirst();
       return firstUniqueChar.orElse('\0');
    }
}