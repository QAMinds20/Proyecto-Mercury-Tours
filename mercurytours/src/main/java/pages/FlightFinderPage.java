package pages;

import org.openqa.selenium.WebDriver;

public class FlightFinderPage extends BasePage {

    public FlightFinderPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());

    }
}
