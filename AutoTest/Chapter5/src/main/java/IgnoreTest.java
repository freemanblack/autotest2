import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1执行啦");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2执行啦");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3执行啦");
    }
}
