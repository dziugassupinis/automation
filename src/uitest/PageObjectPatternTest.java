import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PageObjectPatternTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        //write your code here
        FormPage formPage = new FormPage("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a");
        formPage.enterName("hi");
        formPage.enterEmail("hi@gmail.com");
        formPage.enterSubject("this is a subject");
        formPage.enterMessage("this is a message");
        WebElement success = formPage.submit();
        Assert.assertEquals("Success! Your details have been submitted successfully.", success.getText());
    }


}
