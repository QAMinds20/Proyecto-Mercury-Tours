package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenuSection extends BaseSection{

    private WebElement singOnLink;
    private WebElement singOffLink;
    private WebElement registerLink;
    private WebElement supportLink;
    private WebElement contactLink;

    public TopMenuSection(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        try{
            WebDriverWait wait = new WebDriverWait(this.driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(@bgcolor, '#FF9900')]")));
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public void clickOnSignon() {

        singOnLink.findElement(By.xpath("//a[text()='SIGN-ON']"));
        singOnLink.click();
    }

    public void clickOnSignOff() {
        singOffLink.findElement(By.xpath("//a[text()='SIGN-OFF']"));
        singOffLink.click();
    }

    public void clickOnRegister() {
        registerLink.findElement(By.xpath("//a[text()='REGISTER']"));
        registerLink.click();
    }

    public void clickOnSupport() {
        supportLink.findElement(By.xpath("//a[text()='SUPPORT']"));
        supportLink.click();
    }

    public void clickOnContact() {

        contactLink.findElement(By.xpath("//a[text()='CONTACT']"));

        contactLink.click();
    }
}
