package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

}

