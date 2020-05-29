package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sections.SpecialSection;


public class HomePage extends BasePage {


    private SpecialSection specialSection = new SpecialSection(driver);

    public HomePage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

<<<<<<< HEAD
    public void viewSpecialsDestinations(SpecialSection a) {//fer: agrege el nombre de la variable "a" para que no marcara error
=======
>>>>>>> dev

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

<<<<<<< HEAD
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
=======

>>>>>>> dev
}
