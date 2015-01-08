package UI;

/**
 * Created by vivek.pemawat on 08/01/15.
 */

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseSeleniumTest;
import utility.Log;

public class HomePageNavigationTest extends BaseSeleniumTest {


    @Test
    public void testHomePage() {


        Log.startTestCase("HomePage");
        Assert.assertEquals(driver.getTitle(), "Apigee | API Management | Predictive Analytics");

        Log.endTestCase("HomePage");
    }


}