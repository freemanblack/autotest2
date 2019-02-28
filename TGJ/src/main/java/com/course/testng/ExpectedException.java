package com.course.testng;

import org.testng.annotations.Test;

/**什么时候用到异常测试？
 * 在我们期望结果为某一个异常的时候
 *传入不合法参数，程序抛出异常（想要的结果就是这个异常    ）
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionFailed() {
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions =RuntimeException.class )
    public void runTimeExceptioSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
