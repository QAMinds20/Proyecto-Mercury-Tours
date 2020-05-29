package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MailingInformationSection extends BaseSection {

    private WebElement mailingInfoHeader;

    private WebElement addressLbl;

    private WebElement cityLbl;

    private WebElement stateLbl;

    private WebElement postalCodeLbl;

    private WebElement countryLbl;

    private WebElement address1Txt;

    private WebElement address2Txt;

    private WebElement cityTxt;

    private WebElement stateTxt;

    private WebElement postalCodeTxt;

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
