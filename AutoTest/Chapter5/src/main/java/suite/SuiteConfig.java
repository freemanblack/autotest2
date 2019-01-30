package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 运行啦");

    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行啦");
    }

}
