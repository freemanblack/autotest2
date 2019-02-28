package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testcase1(){
        System.out.printf("Tread Id:%s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
        }
        @Test
        public void testcase2(){
        System.out.printf("Tread Id:%s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
        }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("这是在测试方法之前打印");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("这是在测试方法之后打印");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass这是在类之前运行的方法");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclas这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite测试套件");
    }
}
