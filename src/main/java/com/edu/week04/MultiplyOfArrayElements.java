package com.edu.week04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiplyOfArrayElements {
    /*

Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
a) The First element is replaced the by multiplication the of first and second.
b) The last element is replaced by multiplication of the last and second last.
Input : arr[] = {2, 3, 4, 5, 6} Output : arr[] = {6, 8, 15, 24, 30}
if length 1 ? null ?
     */
    public static void main(String[] args) {
        int [] tt = {2,3,4,5,6};
       int [] RR = updateArray(tt);
        System.out.println(Arrays.toString(RR));
    }

    public static int[] updateArray(int[] numArray) {
      if(numArray == null){
          throw new IllegalArgumentException("Array can not be null value");
      }

        if (numArray.length <= 1) return numArray;
        int [] numArrayResult = new int[numArray.length];
        numArrayResult[0]= numArray[0]*numArray[1]; // the first number
        numArrayResult[numArray.length-1] = numArray[numArray.length-1]*numArray[numArray.length-2];
        for (int i = 1; i < numArray.length-1; i++) {
            numArrayResult[i]= numArray[i-1]*numArray[i+1];
        }
        return numArrayResult;


    }

}
