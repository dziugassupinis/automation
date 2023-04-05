import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        //WebElement linkElement=driver.findElement(By.cssSelector("#username-error"));
        //write your code here
        //Assert.assertEquals("Strings are not the same","Sorry, we don't recognize this email.",linkElement.getText());
        WebElement linkElement = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a"));
        linkElement.click();
        WebElement name = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(2) > input"));
        name.sendKeys("hello");
        WebElement email = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(3) > input"));
        email.sendKeys("hello@gmail.com");
        WebElement subject = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(4) > input"));
        subject.sendKeys("T shirt price");
        WebElement message = driver.findElement(By.cssSelector("#message"));
        message.sendKeys("I would like to get the price of blue t-shirt in euros");
        driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(7) > input")).click();
        driver.switchTo().alert().accept();
        WebElement success = driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success"));


        Assert.assertEquals("Success! Your details have been submitted successfully.", success.getText());
    }
}
