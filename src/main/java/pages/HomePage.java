package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sections.SpecialSection;


public class HomePage extends BasePage {

    private static final String MERCURY_TOURS_MAIN_PAGE = "http://newtours.demoaut.com/";

    public HomePage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public static void open(WebDriver driver) {
        driver.get(MERCURY_TOURS_MAIN_PAGE);
    }

    WebElement viewSpecialsDestinations;

        // This methods are already implemented in Special Section class
//    public void viewSpecialsDestinations(specialSection) {
//
//    }
//
//    public void viewSpecialsPrices(SpecialSection) {
//
//    }
//
//    public void countSpecialDestinationItems(SpecialSection) {
//
//    }

        WebElement viewSpecialsPrices;


        WebElement countSpecialDestinationItems;

        WebElement goToFlights;

        WebElement goToCruises;

        WebElement goToSignOn;

        WebElement goToRegister;

        WebElement goToSupport;

        WebElement goToContact;
}
