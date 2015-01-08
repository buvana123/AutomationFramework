package blog;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Blog;
import utility.BaseSeleniumTest;
import utility.Log;


/**
 * Created by vivek.pemawat on 08/01/15.
 */
public class BlogUINavigationTest extends BaseSeleniumTest {
    @Test
    public void testBlogNavigation() {
        Log.startTestCase("BlogNavigationTest");
        Blog.blogPage(driver).click();
        Assert.assertEquals(driver.getTitle(), "API Best Practices Blog | Apigee");
        Log.endTestCase("BlogNavigatonTest");


    }


}
