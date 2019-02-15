package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
//1、一个简单的@DataProvider示例，直接传递参数
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){

        System.out.println("name=" + name +"; age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData() {
        Object[][] O = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return O;
    }

    //2、DataProvider也支持根据方法名称传递不同的参数测试；+ ITestContext？？可以使用org.testng.ITestContext来确定调用当前测试方法的运行时参数？？

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
      //  System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
        System.out.println("test11方法 name=" + name +"; age=" +age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){

        System.out.println("test22方法 name=" + name +"; age=" +age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 25}
            };


        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"wangwu", 50},
                    {"zhaoliu", 60}
            };
        }

        return result;
    }
}
