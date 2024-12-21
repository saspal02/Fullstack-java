package com.fullstackJava.jUnit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}
