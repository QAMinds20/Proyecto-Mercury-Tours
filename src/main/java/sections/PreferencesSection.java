package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PreferencesSection {
    protected WebElement serviceClass;
    protected Select airline;

    public PreferencesSection(WebDriver driver) {
    }
    protected WebElement clickOnClass(){

    return this.serviceClass;
    }
    protected  Select selectAirline(){
    return this.airline;
    }
}
