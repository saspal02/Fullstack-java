package com.fullstackJava.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

import com.fullstackJava.learn_spring_aop.aopexample.annotations.TrackTime;

@Repository
public class DataService2 {

    @TrackTime
    public int[] retreiveData() {try {
        Thread.sleep(30);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

        return new int[] {111,222,333,444,555};
    }

}
