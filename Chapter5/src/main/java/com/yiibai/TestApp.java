package com.yiibai;

import org.testng.annotations.Test;

public class TestApp {
    //run if all methods from "deploy" and "db" groups are passed

    @Test(dependsOnGroups = {"deploy","db" })
    public void method1(){

        System.out.println("This is method 1");
    }

    //run if method1() is passed
    @Test(dependsOnMethods = {"method1"})
    public void method2(){

        System.out.println("This is method 2");
    }
}
