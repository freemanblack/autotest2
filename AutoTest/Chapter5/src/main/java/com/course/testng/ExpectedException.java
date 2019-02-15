package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionaFailed(){
        System.out.println("这是一个失败的异常测试");
       // throw new RuntimeException();
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionSucess(){
        System.out.println("异常测试成功");
        throw new RuntimeException();
    }
}
