import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest {

    private WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void openBrowser(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testValid(){
        webDriver.findElement(By.id("email")).sendKeys("email@email.com");
        webDriver.findElement(By.id("pass")).sendKeys("pass");
        webDriver.findElement(By.name("login")).click();
    }

    @Test
    public void testInValid(){
        webDriver.findElement(By.id("email")).sendKeys("email@email.com");
        webDriver.findElement(By.id("pass")).sendKeys("pass");
        webDriver.findElement(By.name("logi")).click();
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
    }
}
