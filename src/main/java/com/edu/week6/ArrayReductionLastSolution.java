package com.edu.week6;

import java.util.PriorityQueue;

public class ArrayReductionLastSolution {
    public static void main(String[] args) {
        int [] input = {4,6,8};
        System.out.println(reduceSum(input));
    }
    public static int reduceSum(int[] arr) {
        if (arr== null) {
            throw new IllegalArgumentException("Array can not be null value");
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.offer(num);
        }

        int sum = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            sum += first + second;
            pq.offer(first + second);
        }

        return sum;
    }
}
