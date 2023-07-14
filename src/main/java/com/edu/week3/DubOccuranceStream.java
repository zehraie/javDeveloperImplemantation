package com.edu.week3;

import java.util.stream.Collectors;

public class DubOccuranceStream {
    public static long countDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        return str.toLowerCase()
                .chars()//Converts the string to an IntStream of Unicode code points
                .mapToObj(ch -> (char) ch)//converting the IntStream to a Stream<Character>.
                .filter(Character::isLetterOrDigit)// keep letters and digits
                .collect(Collectors.groupingBy(Character::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1 )
                .count();
    }
}
