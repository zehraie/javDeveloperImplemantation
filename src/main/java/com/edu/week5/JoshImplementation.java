package com.edu.week5;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedHashMap;
import java.util.Map;

public class JoshImplementation {

    public static char findFirstNonRepeatedCharacter(String str) {
        if (str == null) throw new IllegalArgumentException("This string can not be null");

        var frequencyMap = new LinkedHashMap<Character, Integer>();
        char[] charArray = str.toLowerCase().toCharArray();
        for (Character eachChar : charArray) {
            if (!Character.isLetter(eachChar)) continue;//A -> a, 1 -> 1
            if (frequencyMap.containsKey(eachChar)) {
                frequencyMap.put(eachChar, frequencyMap.get(eachChar) + 1);
            } else {
                frequencyMap.put(eachChar, frequencyMap.getOrDefault(eachChar, 0) + 1);
            }
        }
        for (var entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
            if (entry.getValue() == str.length()) return ' ';
        }
        return ' ';
    }
}
