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


}
