package com.edu.week03;

import java.util.HashMap;
import java.util.Map;

public class DublicateOccurance {
    /*
  Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
  The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
  Example:
  "abcde" -> 0 # no characters repeats more than once. "aabbcde" -> 2 # 'a' and 'b'
  "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`) "indivisibility" -> 1 # 'i' occurs six times.
  "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice. "aA11" -> 2 # 'a' and '1'
  "ABBA" -> 2 # 'A' and 'B' each occur twice.
   */
    public static int dipChars(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        int duplicateCount = 0;
        for (int count : charCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;

    }
// dublica olmus satiyi veriyor.

}
