package com.edu.week03;

import java.util.HashMap;
import java.util.Map;

public class DublicateOccurance_2 {

    public static void main(String[] args) {
        System.out.println(lastVersionDublicateMembers(" Successtt*%%%"));
    }
    public static int lastVersionDublicateMembers(String str){

        Map<Character, Integer> map = new HashMap<>();
        char [] charsArray = str.trim().toLowerCase().toCharArray();
        for (Character eachChar : charsArray){
            if(!Character.isLetter(eachChar)) continue;
            if(map.containsKey(eachChar)){
                map.put(eachChar,map.get(eachChar)+1);
            }else {
                map.put(eachChar,1);
            }
        }
        int dublicateCount = 0;
        for (var entry : map.entrySet()){
            if (entry.getValue()>1){
                dublicateCount++;
            }
        }
        return dublicateCount;
    }
}
