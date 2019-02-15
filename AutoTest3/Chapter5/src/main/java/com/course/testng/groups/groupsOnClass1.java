package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class groupsOnClass1 {
    public void stu1(){
        System.out.println("groupsOnClass1中的stu1运行啦");
    }

    public void stu2(){
        System.out.println("groupsOnClass1中的stu2运行啦");
    }
}
