package steps;

import Base.BaseUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Karthik on 10/15/2016.
 */
public class LoginStep extends BaseUtil{

    BaseUtil baseUtil;

    @BeforeTest
    public void beforeTest(){
        baseUtil = new BaseUtil();
        WebDriverManager.chromedriver().setup();
        baseUtil.Driver = new ChromeDriver();
    }

    @Test
    public void myTest(){
        baseUtil.Driver.get(BaseUtil.URL);
    }

    @AfterTest
    public void afterTest(){
        baseUtil.Driver.quit();
    }


}
