package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactInfoSection extends BaseSection {

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[1]//td//b//font/font")
    private WebElement contactInfoHeader;

    @FindBy(how = How.XPATH, using = "//form//tr[2]//td//font/b")
    private WebElement firstNameLbl;

    @FindBy(how = How.XPATH, using = "//form//tr[3]//td//font/b")
    private WebElement lastNameLbl;

    @FindBy(how = How.XPATH, using = "//form//tr[4]//td//font/b")
    private WebElement phoneLbl;

    @FindBy(how = How.XPATH, using = "//form//tr[5]//td//font/b")
    private WebElement emailLbl;

    @FindBy(how = How.XPATH, using = "//input[@name=\"firstName\"]")
    private WebElement firstNameTxt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"lastName\"]")
    private WebElement lastNameTxt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"phone\"]")
    private WebElement phoneTxt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"userName\"]")
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