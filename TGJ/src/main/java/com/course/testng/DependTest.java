package com.course.testng;

import org.testng.annotations.Test;

/**
 * 依赖，test1先执行 然后执行test2 如果test1失败 则不执行test2
 */

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    /** runtest2 此时test1，test2都会被执行
     *
     */

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");

    }
}
