package com.course.testng.parame;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test01(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test02(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test03(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getName());
    }
    @Test
    public void test04(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}
