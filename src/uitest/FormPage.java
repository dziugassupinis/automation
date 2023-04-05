import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormPage extends AbstractTest{

    public FormPage(String cssSelector)  {
         navigateToForm(cssSelector);
    }
    private void navigateToForm(String cssSelector){
        WebElement linkElement = driver.findElement(By.cssSelector(cssSelector));
        linkElement.click();
    }

    public void enterName(String name){
        WebElement nameInPage = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(2) > input"));
        nameInPage.sendKeys(name);
    }
    public void enterEmail(String email){
        WebElement emailInPage = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(3) > input"));
        emailInPage.sendKeys(email);
    }
    public void enterSubject(String subject){
        WebElement subjectInPage = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(4) > input"));
        subjectInPage.sendKeys(subject);
    }
    public void enterMessage(String message){
        WebElement messageInPage = driver.findElement(By.cssSelector("#message"));
        messageInPage.sendKeys(message);
    }
    public WebElement submit(){
        driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(7) > input")).click();
        driver.switchTo().alert().accept();
        WebElement success = driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success"));
        return success;
    }




}
