package com.course.testng.parame;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + ";age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test01(String name, int age) {
        System.out.println("test011111方法的name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test02(String name, int age) {
        System.out.println("test022222方法的name=" + name + ";age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test01")) {
            result = new Object[][]{
                    {"zhangsna", 20},
                    {"wangwu", 30},
                    {"lisi", 40}
            };
        } else if (method.getName().equals("test02")) {
            result = new Object[][]{
                    {"zhaoliu",10}
            };
        }
        return result;
    }
}