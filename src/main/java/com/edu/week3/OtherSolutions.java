package com.edu.week3;

import java.util.HashMap;
import java.util.Map;
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once. "aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`) "indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice. "aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */
public class OtherSolutions {
    public static int dupChars(String str){
        if(str== null || str.length() ==0){
            return 0;
        }

        StringBuilder stringBuilder = new StringBuilder(str.trim().toLowerCase());
        System.out.println(stringBuilder);
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch =stringBuilder.charAt(i);
            if(ch== ' ') continue;
         if(map.containsKey(ch)&& map.get(ch)==1){// only accurannce is 1 it is true
             count++;
         }
         map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return count;
    }
    }


