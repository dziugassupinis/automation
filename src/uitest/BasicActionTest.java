import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicActionTest extends AbstractTest {

    @Test
    public void testPageTitle() {
        //write your code here
        WebElement linkElement = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a"));
        linkElement.click();
        String currentUrl = driver.getCurrentUrl();
        //System.out.println(currentUrl);
        Assert.assertEquals("https://automationexercise.com/contact_us", currentUrl);
    }
}
