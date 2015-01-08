package resources;

/**
 * Created by vivek.pemawat on 08/01/15.
 */
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ResourcesPage;
import utility.BaseSeleniumTest;
import utility.Log;

public class ResourcesPageTest extends BaseSeleniumTest{

    @Test
    public void testResourcesNavigationPage() {
        Log.startTestCase("ResourcesNavigation");
        ResourcesPage.resourcesPage(driver).click();
        Assert.assertEquals(driver.getTitle(),"Resources | Apigee");
        Log.endTestCase("ResourcesNavigation");



    }



}
