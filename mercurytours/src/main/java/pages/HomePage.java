package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {

        super(driver, driver.getCurrentUrl());
    }
}
