package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuSection extends BaseSection{

    private WebElement signOnLink;
    //private WebElement singOffLink;
    private WebElement registerLink;
    private WebElement supportLink;
    private WebElement contactLink;

    public TopMenuSection(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        return true;
    }

    public void clickOnSignOn() {
        signOnLink.click();

    }

    //do we have Sign off link?
    //public void clickOnSignOff() {

    //}

    public void clickOnRegister() {
        registerLink.click();

    }

    public void clickOnSupport() {
        supportLink.click();
    }

    public void clickOnContact() {
        contactLink.click();
    }
}
