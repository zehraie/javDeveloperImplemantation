package com.edu.week1;

public class NonRepetativeVowel {
    public static void main(String[] args) {
     String word = " google";
        int index = findFirstNonRepeatingVowel(word);
        if (index != -1) {
            System.out.println("First non-repeating vowel index: " + index);
            System.out.println("First non-repeating vowel: " + word.charAt(index));
        } else {
            System.out.println("No non-repeating vowel found.");
        }


    }

    public static int findFirstNonRepeatingVowel(String str){
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch) && countVowelOccurrence(str, ch) == 1){
                return i;
            }
        }
        return -1;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countVowelOccurrence(String word, char ch){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
