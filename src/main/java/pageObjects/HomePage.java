package pageObjects;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {


    private static WebElement element = null;
    public static WebElement blogPage(WebDriver driver) {


        element =  driver.findElement(By.linkText("Blog"));

        return element;

    }




}

