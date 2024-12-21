package com.fullstackJava.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    @Pointcut("execution(* com.fullstackJava.learn_spring_aop.aopexample.*.*.*(..))")
    public void businessPackageAndDataPackageConfig() {

    }

    @Pointcut("execution(* com.fullstackJava.learn_spring_aop.aopexample.data.*.*(..))")
    public void businessPackageConfig() {

    }

    @Pointcut("execution(* com.fullstackJava.learn_spring_aop.aopexample.business.*.*(..))")
    public void dataPackageConfid() {

    }

    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBean() {

    }

    @Pointcut("@annotations(com.fullstackJava.learn_spring_aop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation() {

    }
}
