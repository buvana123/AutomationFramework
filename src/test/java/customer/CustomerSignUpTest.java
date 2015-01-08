package customer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Customers;
import utility.BaseSeleniumTest;
import utility.Log;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
public class CustomerSignUpTest extends BaseSeleniumTest {
    @Test
    public void testCustomerNavigationPage() {
        Log.startTestCase("CustomerNavigation");
        Customers.customersPage(driver).click();
        Assert.assertEquals(driver.getTitle(), "Customers | Apigee");
        Log.endTestCase("CustomerNavigation");


    }

}
