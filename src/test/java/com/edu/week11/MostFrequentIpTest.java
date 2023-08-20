package com.edu.week11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static com.edu.week11.MostFrequentIp.*;



class MostFrequentIpTest {

    @Test
    void mostFrequentIPNumber(){
        List <String> listOfIP = List.of(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.3 - GET 2020-08-24",
                "10.0.0.4 - GET 2020-08-20"
        );

        String expectedListOfIp = "10.0.0.1,10.0.0.2";
        String actualListOfIp = mostFrequent(listOfIP);
        Assertions.assertEquals(expectedListOfIp, actualListOfIp);
    }

    @Test
    void mostFrequentIPNumber2(){
        List <String> listOfIP = List.of(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.2 - GET 2020-08-20"

        );

        String expectedListOfIp = "10.0.0.1,10.0.0.2";
        String actualListOfIp = mostFrequent(listOfIP);
        Assertions.assertEquals(expectedListOfIp, actualListOfIp);
    }

}