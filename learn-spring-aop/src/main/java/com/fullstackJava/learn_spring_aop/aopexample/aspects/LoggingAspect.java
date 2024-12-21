package com.fullstackJava.learn_spring_aop.aopexample.aspects;

import com.fullstackJava.learn_spring_aop.aopexample.business.BusinessService1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - when?
    @Before("com.fullstackJava.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessPackageAndDataPackageConfig")//WHEN
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
        logger.info("Before Aspect - {} is called with arguments: {}"
                ,  joinPoint, joinPoint.getArgs());//WHAT
    }

    @After("execution(* com.fullstackJava.learn_spring_aop.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint) {
        logger.info("After Aspect - {} has executed",  joinPoint);
    }

    @AfterThrowing(
            pointcut = "execution(* com.fullstackJava.learn_spring_aop.aopexample.*.*.*(..))",
            throwing = "exception"
    )
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
        logger.info("AfterThrowing Aspect - {} has thrown an exception {}"
                ,  joinPoint, exception);
    }

    @AfterReturning(
            pointcut = "execution(* com.fullstackJava.learn_spring_aop.aopexample.*.*.*(..))",
            returning = "resultValue"
    )
    public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,
                                                      Object resultValue) {
        logger.info("AfterReturning Aspect - {} has returned {}"
                ,  joinPoint, resultValue);
    }
}
