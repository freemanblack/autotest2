package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterTest {
    //使用XML传递参数，通过@Parameters注入到该方法中
    @Test
    @Parameters({"name", "age"})
    public void parameterTest1(String name, int age) {


        System.out.println("name=" + name + "; age=" + age);

    }

}
