package com.edu.week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlmostEquivalent {

    public static void main(String[] args) {
        String[] s = {"aabaab", "saaaaabb"};
        String[] t = {"bbabbc", "ab"};
        List<String> result = allalmostEquivalent(s, t);
        System.out.println(result); // Output: [YES, NO]
    }

    public static List<String> allalmostEquivalent(String [] sArray, String [] tArray){
  List<String> result = new ArrayList<>();

  for (int i=0; i<sArray.length; i++){
      String sStr = sArray[i];
      String tStr = tArray[i];

      if(isAlmostEquivalent(sStr,tStr)){
          result.add("YES");
      }else {
          result.add("NO");
      }
  }
   return result;

    }

    private static boolean isAlmostEquivalent(String sStr, String tStr) {
        Map<Character, Integer> sCounts = new HashMap<>();
        Map<Character, Integer> tCounts = new HashMap<>();

        // Count occurrences of each lowercase letter in sStr
        for (char c : sStr.toCharArray()){
            if(Character.isLowerCase(c)){
               sCounts.put(c,sCounts.getOrDefault(c,0)+1);
            }
        }
        // Count occurrences of each lowercase letter in tStr
        for (char c : tStr.toCharArray()) {
            if (Character.isLowerCase(c)) {
                tCounts.put(c, tCounts.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the difference in occurrences for each letter is no more than 3
    for(var entry : sCounts.entrySet()){
        char c = entry.getKey();
        int sCount = entry.getValue();
        int tCount = tCounts.getOrDefault(c,0);
        if (Math.abs(sCount-tCount)>3) return false;
    }
    for (var entry : tCounts.entrySet()){
        char c = entry.getKey();
        int tCount = entry.getValue();
        int sCount = sCounts.getOrDefault(c,0);
        if (Math.abs(tCount - sCount) > 3) return false;
    }

    return true;
    }

}
