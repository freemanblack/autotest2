package MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread ID:%s %n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread ID:%s %n",Thread.currentThread().getId());//注意不是println
    }

    @Test
    public void test3(){
        System.out.printf("Thread ID:%s %n",Thread.currentThread().getId());
    }
}
