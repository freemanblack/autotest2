package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups1 {
    @Test(groups = "mysql")
    public void testConnectMsSQL1(){
        System.out.println("testConnectMsSQL1运行啦");
    }

    @Test(groups = "database")
    public void testConnectMsSQL2(){
        System.out.println("testConnectMsSQL2运行啦");
    }
    @Test(groups = {"mysql","database"})
    public void testConnectMsSQL3(){
        System.out.println("testConnectMsSQL3运行啦");
    }

    @BeforeGroups("mysql")
    public void beforeGroupsOnMysql(){
        System.out.println("这是Mysql组运行之前运行的方法");
    }

    @AfterGroups("mysql")
    public void afterGroupsOnMysql(){
        System.out.println("这是Mysql组运行之后运行的方法");
    }

    @BeforeGroups("database")
    public void beforeGroupsOnDatabase(){
        System.out.println("这是Database组运行之前运行的方法");
    }

    @AfterGroups("database")
    public void afterGroupsOnDatabase(){
        System.out.println("这是Database组运行之后运行的方法");
    }

}
