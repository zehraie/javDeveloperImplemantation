package com.edu.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SecondSolution {
    public static void main(String[] args) {
        String []lines = new String []{
                    "10.0.0.1 - GET 2020-08-24",
                    "10.0.0.1 - GET 2020-08-24",
                    "10.0.0.2 - GET 2020-08-20",
                    "10.0.0.2 - GET 2020-08-20",
                    "10.0.0.3 - GET 2020-08-24",
                    "10.0.0.4 - GET 2020-08-20"
        };
        getMostFrequentIp(lines);
    }

    public static void getMostFrequentIp(String [] logs){
        HashMap<String, Integer> map = new HashMap<>();
        for(String log : logs){
            String[] ips = log.split(" ");
            map.put(ips[0],map.getOrDefault(ips[0],0)+1);
        }
        System.out.println(map);
        System.out.println(map.keySet());

        List<String> mostFrequent = new ArrayList<>();
        int freq=0;
        for(String ip : map.keySet()){

            freq = Math.max(freq, map.get(ip));
        }
        System.out.println(freq);
        for(String ip : map.keySet()){
            if (map.get(ip) ==freq) mostFrequent.add(ip);
        }
        System.out.println("mostFrequent: "+ mostFrequent);
    }
    }
