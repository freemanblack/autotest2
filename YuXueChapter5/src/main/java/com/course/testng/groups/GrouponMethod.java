package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
public class GrouponMethod {
    @Test(groups ="server")
    public void Test1(){
        System.out.println("这是服务端的测试方法1111");
    }
    @Test(groups="server")
    public void Test2(){
        System.out.println("这是服务端的测试方法2222");
    }
    @Test(groups="client")
    public void Test3(){
        System.out.println("这是客户端的测试方法111111");
    }
    @Test(groups="client")
    public void Test4(){
        System.out.println("这是客户端的测试方法222222");
    }
    @BeforeGroups(groups = "server")
    public void  beforegrouponserver(){
        System.out.println("这是服务端组方法运行之前运行的方法");
    }
    @AfterGroups("server")
    public void  aftergrouponserver(){
        System.out.println("这是服务端组方法运行之后运行的方法");

    }
    @BeforeGroups("client")
    public void  beforegrouponclient(){
        System.out.println("这是客户端组方法运行之前运行的方法");
    }
    @AfterGroups("client")
    public void  aftergrouponclient() {
        System.out.println("这是客户端组方法运行之后运行的方法");
    }

}