package pages;

import org.openqa.selenium.WebDriver;
import sections.FlightDetailsSection;
import sections.PreferencesSection;

public class FlightFinderPage extends BasePage {

    // Sections inside the Flight Finder Page
    private PreferencesSection preferenceSection;

    private FlightDetailsSection flightDetailsSection;

    public FlightFinderPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());

        // Insert Related sections

        this.preferenceSection = new PreferencesSection(this.driver);
        this.flightDetailsSection = new FlightDetailsSection((this.driver));
    }

    public PreferencesSection getPreferenceSection() {
        return preferenceSection;
    }

    public FlightDetailsSection getFlightDetailsSection() {
        return flightDetailsSection;
    }

    public void clickOnContinue(){
        
    }
}
