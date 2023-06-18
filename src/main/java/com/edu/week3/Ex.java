package com.edu.week3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex {
    public static void main(String[] args) {
        List<String> list = List.of("Ayse", "Zeynep","Tarik");
        List<String> sortedList = list.stream().sorted(Comparator.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
