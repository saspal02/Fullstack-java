package com.fullstackJava.learn_spring_aop.aopexample.business;

import com.fullstackJava.learn_spring_aop.aopexample.annotations.TrackTime;
import com.fullstackJava.learn_spring_aop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax() {
        int[] data = dataService1.retreiveData();

        //throw new RuntimeException("Something is Wrong!");
        return Arrays.stream(data).max().orElse(0);
    }

}
