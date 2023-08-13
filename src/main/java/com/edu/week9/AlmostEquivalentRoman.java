package com.edu.week9;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AlmostEquivalentRoman {
    public static void main(String[] args) {

        int num1 = 780;
        System.out.println(Arrays.toString(convertToArray2(num1)));
        System.out.println(Arrays.toString(convertToArray1(num1)));
        System.out.println(Arrays.toString(convertArray3(num1)));
        int a = 490;
        int t =a%10;   // 0
        a /=10;  //49

        int c = 49%10; //9
        a =a/10;   // 4  a /=10
        System.out.println(Arrays.toString(convertToArray1(a)));
    }

    public static Object[] convertToArray1(int num){
        return convertNumberToSlack(num).toArray();
    }

    public  static Deque<Integer> convertNumberToSlack(int num){
        Deque<Integer> stack = new LinkedList<>();
        do{
            stack.push(num%10);
            num /=10;
        }while(num > 0);
        return stack;
    }

    //second solution
    public static int [] convertToArray2(int num1){
        return Arrays.stream(String.valueOf(num1).split(""))
                .mapToInt(digit ->Integer.parseInt(digit))
                .toArray();
    }

    public static Integer [] convertArray3(int num){
        LinkedList<String> result =new LinkedList<>(Arrays.asList(String.valueOf(num).split("")));
        return result.stream()
                .map(str->Integer.parseInt(str)).collect(Collectors.toList()).toArray(new Integer[0]);
 /*
 The choice of new Integer[0] as the parameter is a common idiom in Java when converting
 a collection to an array, as it allows the toArray() method to determine the size of the resulting array
 based on the number of collected elements. The resulting array is then returned as
 the final result of the convertArray3 method.

Using toArray(new Integer[0]) ensures that the type of the resulting array matches the expected type Integer[],
and it provides a flexible way to create the array dynamically without having to pre-specify a fixed size.
  */
    }

}
