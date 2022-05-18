package com.keyin.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public static void main(String[] args) {

        Demo demoUnderTest = new Demo();
//        Assertions.assertTrue(new Demo().returnTrue()); // Another way of printing something, if only one line.
        System.out.println(demoUnderTest.returnTrue());
    }
}
