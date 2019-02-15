package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupsOnClass3 {
    public void teacher1(){
        System.out.println("groupsOnClass3中的teacher1运行啦");
    }

    public void teacher2(){
        System.out.println("groupsOnClass3中的teacher2运行啦");
    }
}
