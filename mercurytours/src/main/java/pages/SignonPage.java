package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignonPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'SIGN-ON')]")
    private WebElement singOnLink;

    @FindBy(how = How.XPATH, using = "(//font[contains(@face, 'Arial') and @size = '2'])[1]")
    private WebElement welcomeMessage;

    @FindBy(how = How.XPATH, using = "//a[contains(@href, 'mercurywelcome')]")
    private WebElement registrationLink;

    @FindBy(how = How.NAME, using = "userName")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "login")
    private WebElement submitButton;

    @FindBy(how = How.CLASS_NAME, using = "footer")
    private WebElement copyRight;

    public SignonPage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
    }

    public void clickOnSingOn() {
        singOnLink.click();
    }

    public void clickOnSubmit() {
        submitButton.click();
    }

    public void clickOnRegistrationLink() {
        registrationLink.click();
    }

    public void enterUser(String user) {
        userName.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public String getCopyRight() {
        return copyRight.getText();
    }


}
