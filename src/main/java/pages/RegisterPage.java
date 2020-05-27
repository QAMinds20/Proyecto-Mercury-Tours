package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sections.ContactInfoSection;
import sections.MailingInformationSection;
import sections.UserInfoSection;

public class RegisterPage extends BasePage{

    private UserInfoSection userInfoSection;

    private ContactInfoSection contactInfoSection;

    private MailingInformationSection mailingInformationSection;

    @FindBy(how = How.NAME, using = "register")
    private WebElement submitButton;

    public RegisterPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        //Init all Sections
        this.userInfoSection = new UserInfoSection(this.driver);
        this.contactInfoSection = new ContactInfoSection(this.driver);
        this.mailingInformationSection = new MailingInformationSection(this.driver);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public UserInfoSection getUserInfoSection() {
        return userInfoSection;
    }

    public ContactInfoSection getContactInfoSection() {
        return contactInfoSection;
    }

    public MailingInformationSection getMailingInformationSection() {
        return mailingInformationSection;
    }
}
