package com.edu.week7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] tt = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum2(tt,9)));
    }
    // Opttimal Solution 0(n)
    public static int[] twoSum2(int [] array, int target){
        if (array== null) {
            throw new IllegalArgumentException("Array can not be null value");
        }
        //Create HashMap
        Map<Integer,Integer> map = new HashMap<>();

        //Iterate over the array
        //if a potential match exists return that indices else put the array value and index to map
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);
        }
        return new int[] {};
    }
}
