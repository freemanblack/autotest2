package com.course.testng;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;
import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut=3000) //单位为毫秒
    public void testsuccess()throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed()throws InterruptedException{
        Thread.sleep(3000);
    }
}
