package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "(//font[contains(@face, 'Arial') and (@size=2)]")
    private WebElement flightMessage;

    public HomePage(WebDriver driver) {

        super(driver, driver.getCurrentUrl());
    }

    public String getFlightMessage() {
        return flightMessage.getText();
    }

}
