package com.edu.week5;

public class FindFirstUniqeCharacter {

    public static char findFirstNonRepeatedCharacter(String str) {
        int[] characterCount = new int[256]; // Assuming ASCII characters

        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            characterCount[c]++;
        }

        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (characterCount[c] == 1) {
                return c;
            }
        }

        // If all characters are repeated, return a space character
        return ' ';
    }
    public static void main(String[] args) {
        String input = "success";
        char output = findFirstNonRepeatedCharacter(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

}
