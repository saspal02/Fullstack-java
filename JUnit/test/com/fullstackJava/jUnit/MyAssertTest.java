package com.fullstackJava.jUnit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

    @Test
    public void test () {
        boolean test = todos.contains("Learn Spring MVC");
        boolean test2 = todos.contains("GCP");
        assertTrue(test);
        assertFalse(test2);

        assertArrayEquals(new int[]{1,2},new int[]{1,2});
        assertEquals(3,todos.size(),"Error Message");



    }

}