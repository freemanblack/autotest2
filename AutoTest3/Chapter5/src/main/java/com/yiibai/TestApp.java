package com.yiibai;

import org.testng.annotations.Test;

@Test(dependsOnGroups = {"deploy","db"})
public class TestApp {
    public void method1(){
        System.out.println("This is method1");
    }

    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("this is method2");
    }
}
