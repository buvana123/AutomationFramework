package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
public class LoginPage {
    private static WebElement element = null;
    public static WebElement loginPage(WebDriver driver) {

        element =  driver.findElement(By.linkText("Sign In"));

        return element;

    }
}
