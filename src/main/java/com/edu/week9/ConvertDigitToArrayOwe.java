package com.edu.week9;

import java.util.Arrays;
import java.util.Optional;

public class ConvertDigitToArrayOwe {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDigits_Version1(String.valueOf("785"))));
    }

    public static int [] getDigits_Version1(String str){
        Integer number = Integer.parseInt(str);
        if(number == null || number <0)
            throw new IllegalArgumentException("input should not be null or negative integer");
        char[] chars = Integer.toString(number).toCharArray();
        int [] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] =chars[i] - '0';
        }
        return ints;
    }

    public static int [] getDigits_Version2(String str){
        Integer number = Integer.parseInt(str);
        Optional.ofNullable(number).orElseThrow(() -> new IllegalArgumentException(" can not be null"));
        if(number <0)
            throw new IllegalArgumentException("input should not be null or negative integer");
        char[] chars = Integer.toString(number).toCharArray();
        int [] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] =chars[i] - '0';
        }
        return ints;
    }

    static int[] getDigitsWithStream(int number){
        return Integer.toString(number)
                .chars()
                .map(tr-> Character.getNumericValue(tr))
                .toArray();
    }

    static int[] getDigitsWithStream2(int number){
        return Integer.toString(number)
                .chars()
                .map(c->c-'0')
                .toArray();
    }
}
