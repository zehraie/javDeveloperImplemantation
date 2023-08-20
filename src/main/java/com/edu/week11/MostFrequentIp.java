package com.edu.week11;

import java.util.*;

public class MostFrequentIp {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.3 - GET 2020-08-24",
                "10.0.0.4 - GET 2020-08-20"
        );

        String result = mostFrequent(lines);
        System.out.println(result);
    }

    public static String mostFrequent(List<String> logs){

        List<String> nonNullLogs = Optional.ofNullable(logs)
                .orElseThrow( ()-> new  IllegalArgumentException(" Logs can not be null"));

        Map<String, Integer> ipCountMap = new HashMap<>();
        for (String log : nonNullLogs) {
            String ip = log.split("-")[0];
            ipCountMap.put(ip,ipCountMap.getOrDefault(ip,0)+1);

        }
        int maxCount = Collections.max(ipCountMap.values());
        List<String> mostFrequentIPs = new ArrayList<>();

        for(Map.Entry<String , Integer> entry : ipCountMap.entrySet()){
            if(entry.getValue() == maxCount){
                mostFrequentIPs.add(entry.getKey().strip());
            }
        }


        Collections.sort(mostFrequentIPs);
       System.out.println("List: "+mostFrequentIPs);
        return String.join(",",mostFrequentIPs);

    }
}
