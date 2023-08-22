package com.maicoding.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyBeforeAfterTestTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");

    }

    @Test
    void test(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
}