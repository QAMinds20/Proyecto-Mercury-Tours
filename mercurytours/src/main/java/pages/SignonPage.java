package pages;

import org.openqa.selenium.WebDriver;

public class SignonPage extends BasePage {

    public SignonPage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
    }
}
