package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionSucess(){
        System.out.println("异常测试成功");
        throw new RuntimeException();
    }
}
