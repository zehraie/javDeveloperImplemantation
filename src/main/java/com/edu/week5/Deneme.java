package com.edu.week5;

public class Deneme {

    public static char findFirstNonRepeatedCharacter(String str){
      int [] characterCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            characterCount[c]++;

        }
        for (int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(characterCount[c]==1){
                return c;
            }
        }
        return ' ';

    }
}
