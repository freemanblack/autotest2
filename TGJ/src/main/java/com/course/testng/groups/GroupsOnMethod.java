package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法4");
    }
    @BeforeGroups("server")
    public void beforegroupsonserver(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void aftergroupsonserver(){
        System.out.println("这是服务端组运行之hou运行的方法");
    }
    @BeforeGroups("client")
    public void beforegroupsonclient(){
        System.out.println("这是KEHU端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void aftergroupsonclient(){
        System.out.println("这是客户端组运行之hou运行的方法");
    }
}
