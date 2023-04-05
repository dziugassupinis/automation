import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorTest extends AbstractTest {

//    @Test
//    public void testSignInText() {
//        //write your code here
//    }
    @Test
    public void verifySignInLinkInNav() {
        WebElement linkElement=driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"));
        //write your code here

        Assert.assertEquals("Signup / Login", linkElement.getText());
    }

    @Test
    public void verifyBlueShirtPrice() {
        //write your code here
        WebElement linkElement=driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(36) > div > div.single-products > div.productinfo.text-center > h2"));
        //write your code here

        Assert.assertEquals("Rs. 1389", linkElement.getText());

        // List<WebElement> listOfItems = driver.findElements(By.cssSelector("col-sm-4");
//        for(WebElement item:listOfItems){
//            if()
//        }
    }

    @Test
    public void verifyEmailAddressValueInContacts() {
        //write your code here
        WebElement linkElement = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a"));
        linkElement.click();
        linkElement = driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-4 > div > address > p:nth-child(3) > a > u"));
        Assert.assertEquals("feedback@automationexercise.com", linkElement.getText());
        //driver.get("https://automationexercise.com/contact_us");
        //WebElement linkElement=driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-4 > div > address > p:nth-child(3) > a > u"));
        //Assert.assertTrue("feedback@automationexercise.com".equals(linkElement.getText()));
    }


}
