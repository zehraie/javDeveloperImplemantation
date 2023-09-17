package com.edu.week04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplyOfArrayElement_Stream {
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
        IntStream.range(1,numArray.length-1)
                .forEach(i-> numArrayResult[i]=numArray[i-1]*numArray[i+1]);
        return numArrayResult;


    }
}
