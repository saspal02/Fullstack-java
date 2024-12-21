package com.fullstackJava.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    public int[] retreiveData() {try {
        Thread.sleep(30);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

        return new int[] {1,2,3,4,5};
    }

}
