package com.edu.week9;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertDigitNumToArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(returnArray(490)));

        int[] numbers = {1, 2, 3, 4, 5};
        // Convert the int array to a stream of integers
        Stream<Integer> stream = Arrays.stream(numbers).boxed();
        int [] bt= Arrays.stream(numbers).toArray();
        System.out.println(Arrays.toString(bt));
    }
    // solution1
    static int[] returnArray(int num){
        return Arrays.stream(Integer.toString(num).split(""))
                .mapToInt(Integer::valueOf).toArray();

//        String [] str = Integer.toString(num).split("");
//        int [] array = new int[str.length];
//        for (int s = 0; s < str.length; s++) {
//            array[s]= Integer.valueOf(str[s]);
//        }
//        return array;

    }
}
