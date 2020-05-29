package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MailingInformationSection extends BaseSection {

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[6]//td//b//font/font")
    private WebElement mailingInfoHeader;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[7]//td[1]")
    private WebElement addressLbl;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[9]//td[1]")
    private WebElement cityLbl;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[10]//td[1]")
    private WebElement stateLbl;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[11]//td[1]")
    private WebElement postalCodeLbl;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[12]//td[1]")
    private WebElement countryLbl;

    @FindBy(how = How.XPATH, using = "//input[@name=\"address1\"]")
    private WebElement address1Txt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"address2\"]")
    private WebElement address2Txt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"city\"]")
    private WebElement cityTxt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"state\"]")
    private WebElement stateTxt;

    @FindBy(how = How.XPATH, using = "//input[@name=\"postalCode\"]")
    private WebElement postalCodeTxt;

    @FindBy(how = How.XPATH, using = "//form//tbody//tr[12]//select")
    private WebElement conntrySelect;


    public MailingInformationSection(WebDriver driver) {
        super(driver);
    }

    public void setAddress(String address) {
        address1Txt.sendKeys(address);
    }

    public void setCity(String city) {
        cityTxt.sendKeys(city);
    }

    public void setState(String state) {
        stateTxt.sendKeys(state);
    }

    public void setPostalCode(String postcode) {
        postalCodeTxt.sendKeys(postcode);
    }

    public void selectCountryByName(String countryname) {
        Select select = new Select(conntrySelect);
        select.selectByVisibleText(countryname);
    }

    public void selectCountryByIndex(int index) {
        Select select = new Select(conntrySelect);
        select.selectByIndex(index);
    }

}
