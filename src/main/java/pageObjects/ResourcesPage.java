package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
public class ResourcesPage {
    private static WebElement element = null;
    public static WebElement resourcesPage(WebDriver driver) {
        element =  driver.findElement(By.linkText("Resources"));
        return element;

    }

}
