import base.commonAPI;
import org.openqa.selenium.By;

/**
 * Created by mahmudurrahman
 * On 4/27/18.
 */
public class getfacebook extends commonAPI {
    public void getFB(){

        driver.navigate().to("http://www.facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("mikat16@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Max$ymvit777");
        driver.findElement(By.cssSelector("#loginbutton")).click();
        driver.findElement(By.cssSelector("#xhpc_message")).click();
    }
}
