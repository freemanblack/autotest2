package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
   @Test
    public void testCase1(){

       System.out.println("This is case1");
    }

    @Test
    public void testCase2(){
        System.out.println("This is case2");
    }

    @BeforeMethod
    public void beforeMethod(){

       System.out.println("beforeMethod 这是方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){

       System.out.println("afterMethod这是方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是类之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("beforeClass这是类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite这是测试套件之前运行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite这是测试套件之后运行的");
    }



}

