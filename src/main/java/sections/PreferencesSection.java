package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class PreferencesSection extends BaseSection{

    protected List<WebElement> serviceClass;
    @FindBy(how = How.XPATH, using = "(//font[contains(@face, 'Arial') and (@size=2)]])")
    private WebElement getFlightMessage;
     protected Select airline;

// Constructor de PreferencesSection
    public PreferencesSection(WebDriver driver) {
        super(driver);
        serviceClass=driver.findElements(By.cssSelector("input[name=servClass]"));
        airline= (Select) driver.findElements(By.xpath("select[name='airline']"));
    }
    public List<WebElement> clickOnClass(){
        return this.serviceClass;
    }

    public  void selectAirline(int index){
        this.airline.selectByIndex(index);
    }

    public  void selectAirline(String airline){
        this.airline.selectByVisibleText(airline);
    }

    public  Select getAirline(){
        return (Select) this.airline;
    }


    public String getFlightMessageMethod() {
        return getFlightMessage.getText();
    }

}
