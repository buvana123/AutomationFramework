/**
 * Created by vivek.pemawat on 08/01/15.
 */
package utility;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    public static WebDriver driver;
    public String baseUrl;
    public String browser;
    public static GetConfigProperties getConfigProperties=new GetConfigProperties();

    public BaseSeleniumTest() {
        this.baseUrl = getConfigProperties.properties.getProperty("URL");
        this.browser = getConfigProperties.properties.getProperty("browser");

    }


    @BeforeMethod

    public void beforeMethod() throws Exception {

        DOMConfigurator.configure("log4j.xml");
        if (browser.compareTo("firefox") == 0) {
            driver = new FirefoxDriver();

        }
        if (browser.compareTo("chrome") == 0) {
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();

    }

}
