package com.fullstackJava.learn_spring_aop.aopexample.business;

import com.fullstackJava.learn_spring_aop.aopexample.data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {

    private DataService2 dataService2;

    public BusinessService2(DataService2 dataService2) {
        this.dataService2 = dataService2;
    }

    public int calculateMin() {
        int[] data = dataService2.retreiveData();

        //throw new RuntimeException("Something is Wrong!");
        return Arrays.stream(data).min().orElse(0);
    }

}
