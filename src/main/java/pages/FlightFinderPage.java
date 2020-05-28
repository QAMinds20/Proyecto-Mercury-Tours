package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sections.FlightDetailsSection;
import sections.PreferencesSection;

import java.util.prefs.Preferences;

public class FlightFinderPage extends BasePage {

    // Sections inside the Flight Finder Page
    protected PreferencesSection preferenceSection;
    protected FlightDetailsSection flightDetailsSection;
    private WebElement onContinue;

    public FlightFinderPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());

        // Insert Related sections

        this.preferenceSection = new PreferencesSection(this.driver);
        this.flightDetailsSection = new FlightDetailsSection((this.driver));
        this.onContinue= driver.findElement(By.cssSelector("input[name=findFlights]"));
    }

    public PreferencesSection getPreferenceSection() {
        return preferenceSection;
    }

    public FlightDetailsSection getFlightDetailsSection() {

        return flightDetailsSection;
    }

    private void clickOnContinue(){
        
    }

}
