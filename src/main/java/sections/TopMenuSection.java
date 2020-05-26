package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        return true;
    }

    public void clickOnSignOn() {

    }

    public void clickOnSignOff() {

    }

    public void clickOnRegister() {

    }

    public void clickOnSupport() {

    }

    public void clickOnContact() {

    }
}
