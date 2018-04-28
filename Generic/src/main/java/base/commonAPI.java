package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by mahmudurrahman
 * On 4/27/18.
 */
public class commonAPI {
    public WebDriver driver = null;
 // @Test
    @BeforeMethod
    public void beforetesting(){
        System.setProperty("webdriver.chrome.driver","/Users/mahmudurrahman/IdeaProjects/msf/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("http://www.facebook.com");
        driver.manage().window().maximize();
    }
}
