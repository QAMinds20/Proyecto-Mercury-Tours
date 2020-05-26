package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	private static final String MERCURY_TOURS_MAIN_PAGE = "http://newtours.demoaut.com/";

    public HomePage(WebDriver driver) {

        super(driver, driver.getCurrentUrl());
    }

    public static void open(WebDriver driver) {
    	driver.get(MERCURY_TOURS_MAIN_PAGE);
    }
}
