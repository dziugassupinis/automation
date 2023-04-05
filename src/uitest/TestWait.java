import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestWait extends AbstractTest {

    @Test
    public void testWait() throws InterruptedException {
        //write your code here

        WebElement linkElement = driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products"));
        linkElement.click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        linkElement = driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.product-overlay > div > a"));
        linkElement.click();

        linkElement = driver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button"));
        Thread.sleep(5000);
        System.out.printf("value out:"+String.valueOf(linkElement.isDisplayed()));
        Assert.assertTrue(linkElement.isDisplayed());


    }
}
