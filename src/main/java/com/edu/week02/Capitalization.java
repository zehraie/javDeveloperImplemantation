package com.edu.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalization {
    public static void main(String[] args) {
        String str = "Ali eve gel";
        System.out.println(toJadenCase3(str));
        String str2 = null;
        String str3 = "";
        System.out.println(toJadenCase3(str2));
        System.out.println(toJadenCase3(str3));
    }
   //REDUCE ************
    public static String toJadenCase(String str) {

        List<String> listCapital = new ArrayList<>();
        // listCapital = Arrays.asList(str.split("\\s+"));  //We split the input string into an array of words using the regular expression \\s+, which matches one or more whitespace characters.
        listCapital = Arrays.asList(str.split(" "));
        System.out.println(listCapital);
        if (str == null || str.isEmpty()) {
            return "";
        }
        return listCapital.stream().map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ")
                .reduce((a, b) -> a.concat(b)).get().trim();
    }

    public static String toJadenCase2(String str) {

        List<String> listCapital = new ArrayList<>();
        listCapital = Arrays.asList(str.split(" "));
        System.out.println(listCapital);
        if (str == null || str.isEmpty()) {
            return "";
        }
        return listCapital.stream().map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining( " "));
    }

    public static String toJadenCase3(String str) {

        try {
            if (str != null && !str.isEmpty()) {
                List<String> listCapital = Arrays.asList(str.split(" "));
                System.out.println(listCapital);
                return listCapital.stream().map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                        .collect(Collectors.joining(" "));
            }else
            return "";
        }catch (NullPointerException e){
            return "";
        }
    }



}



/**
Jaden Casing Strings
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
Your task is to write a method that converts strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
Note that this function should a return empty string for an empty string or null.
Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real" Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"

 */