package pages;

import org.openqa.selenium.WebDriver;

public class BookAFlightPage extends BasePage {

	public BookAFlightPage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
        //All related sections will be here
    }

}