package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
import org.openqa.selenium.*;

public class AboutMePage {
    private static WebElement element = null;

    public static WebElement signUp(WebDriver driver) {


        element = driver.findElement(By.linkText("Sign In"));

        return element;

    }

    public static WebElement customerPage(WebDriver driver) {


        element = driver.findElement(By.linkText("Customers"));

        return element;

    }


}
