package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
public class ProductsPage {
    private static WebElement element = null;
    public static WebElement productsPage(WebDriver driver) {


        element =  driver.findElement(By.linkText("Products"));

        return element;

    }
}
