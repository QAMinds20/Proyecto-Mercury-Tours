package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterSuccessPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//font[contains(text(),'Thank you for registering')]")
    private WebElement successMsg;

    @FindBy(how = How.XPATH, using = "//a[@href='mercurywelcome.php']")
    private WebElement signOnLink;

    @FindBy(how = How.XPATH, using = "//font/b[contains(text(),'Note')]//text()")
    private WebElement noteMsg;

    public RegisterSuccessPage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
    }

    public void clickOnSingOn() {
        this.signOnLink.click();
    }

    public String getSuccessMsgText() {
        return this.successMsg.getText();
    }

    public String getNoteMsgText() {
        return this.noteMsg.getText();
    }

}
