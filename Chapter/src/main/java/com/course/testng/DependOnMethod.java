package com.course.testng;

import org.testng.annotations.Test;

public class DependOnMethod {
    @Test
    public void test01(){
        System.out.println("测试01，作为测试02的前置条件");
        //如果将test01的测试抛出，如下面代码所示，那么test02将不执行
       // throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("测试02，需要依赖测试01");
    }

}
