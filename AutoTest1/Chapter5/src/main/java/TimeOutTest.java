import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//毫秒，1s=1000ms
    public void testSuccess()throws InterruptedException{
        Thread.sleep(2000);//注意手敲millis错误,直接敲数字回车后会自动带出单位
    }

    @Test(timeOut =2000)
    public void testFailed()throws InterruptedException{
        Thread.sleep(4000);
    }
}
