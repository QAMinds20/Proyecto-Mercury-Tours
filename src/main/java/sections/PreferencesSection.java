package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class PreferencesSection extends BaseSection{

    @FindBy(how = How.XPATH, using = "(//font[contains(@face, 'Arial') and (@size=2)]])")
    private WebElement getFlightMessage;

    protected WebElement serviceClass;
    protected Select airline;

    public PreferencesSection(WebDriver driver) {
        super(driver);
    }

    protected WebElement clickOnClass(){

    return this.serviceClass;
    }
    protected  Select selectAirline(){
    return this.airline;
    }

    public String getFlightMessageMethod() {
        return getFlightMessage.getText();
    }
}
