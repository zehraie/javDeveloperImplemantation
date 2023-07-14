package com.edu.week6;
import org.thymeleaf.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayReduction {
    public static void main(String[] args) {
        int [] tt = {4,6,8};
        System.out.println(arrayReductionCost(tt));
    }
    public static int arrayReductionCost(int [] num) {
        if (num == null) {
            throw new IllegalArgumentException("Array can not be null value");
        }
        // List<Integer> list = new ArrayList<>(Arrays.asList(num));
        List<Integer> list = new ArrayList<>();
        for (int i : num){
            list.add(i);
        }
        int sum = 0;
        int result = 0;
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(0));
                sum = list.get(0) + list.get(1);
                result += sum;
                list.remove(0);
                list.remove(0);
                list.add(list.size() , sum);
            }
        }
        System.out.println("result"+ result );
        return result;
    }
}