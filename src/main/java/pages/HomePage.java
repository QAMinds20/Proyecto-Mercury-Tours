package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sections.SpecialSection;


public class HomePage extends BasePage {

    //Information already added before my latest changes
    @FindBy(how = How.XPATH, using = "(//font[contains(@face, 'Arial') and (@size=2)]")
    private WebElement flightMessage;

    //Information already added before my latest changes
    public String getFlightMessage() {
        return flightMessage.getText();
    }

    public HomePage(WebDriver driver) {

        super(driver, driver.getCurrentUrl());
    }

    public void viewSpecialsDestinations(SpecialSection a) {//fer: agrege el nombre de la variable "a" para que no marcara error

    }

    public void viewSpecialsPrices(SpecialSection b) {//fer: agrege el nombre de la variable "b" para que no marcara error

    }

    public void countSpecialDestinationItems(SpecialSection c) {//fer: agrege el nombre de la variable "c" para que no marcara error

    }

    public void goToFlights() {

    }

    public void goToCruises() {

    }

    public void goToSignOn() {

    }

    public void goToRegister() {

    }

    public void goToSupport() {

    }

    public void goToContact() {

    }
}
