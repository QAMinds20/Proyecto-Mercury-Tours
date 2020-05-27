package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactInfoSection extends BaseSection {

    //Add @FindBy(how = How.XPATH, using = "") for each element

    private WebElement contactInfoHeader;

    private WebElement firstNameLbl;

    private WebElement lastNameLbl;

    private WebElement phoneLbl;

    private WebElement emailLbl;

    private WebElement firstNameTxt;

    private WebElement lastNameTxt;

    private WebElement phoneTxt;

    private WebElement emailTxt;

    public ContactInfoSection(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String fname) {
        firstNameTxt.sendKeys(fname);
    }

    public void setLastName(String lname) {
        lastNameTxt.sendKeys(lname);
    }

    public void setPhone(String phone) {
        phoneTxt.sendKeys(phone);
    }

    public void setEmail(String email) {
        emailTxt.sendKeys(email);
    }

    public String getFirstNameLblFontColor() {
        return this.firstNameLbl.getAttribute("color");
    }

    public String getLastNameLblFontColor() {
        return this.lastNameLbl.getAttribute("color");
    }

    public String getPhoneLblFontColor() {
        return this.phoneLbl.getAttribute("color");
    }

    public String getEmailLbFontColor() {
        return this.emailLbl.getAttribute("color");
    }

    public String getContactInfoHeaderText() {
        return this.contactInfoHeader.getText();
    }
}
