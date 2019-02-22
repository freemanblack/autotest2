package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void  testcase1(){
        System.out.println("Test 这是测试用例1");

    }
    @Test
    public  void testcase2(){
        System.out.println("Test 这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod 这是在每一个测试方法之前运行的");
    }
    @AfterMethod
    public  void  afterMethod(){
        System.out.println("afterMethod 这是在每一个测试方法之后运行的");
    }
    @BeforeClass
       public void  beforeClass(){
        System.out.println("beforeClass 这是在类运行之前运行的");
    }
    @AfterClass
        public void afterClass(){
        System.out.println("afterClass 这是在类运行之后运行的");
    }
     @BeforeSuite
        public void beforeSuite(){
        System.out.println("beforeSuite 测试套件包裹在类外，先执行在执行类");

     }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 测试套件 类运行之后运行");

    }
}
