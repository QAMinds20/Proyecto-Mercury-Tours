package pages;

import org.openqa.selenium.WebDriver;
import sections.FlightDetailsSection;

public class FlightFinderPage extends BasePage {

    // Sections inside the Flight Finder Page
    private PreferenceSection preferenceSection;

    private FlightDetailsSection flightDetailsSection;

    public FlightFinderPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());

        // Insert Related sections

        this.preferenceSection = new PreferenceSection(this.driver);
        this.flightDetailsSection = new FlightDetailsSection((this.driver));
    }

    public PreferenceSection getPreferenceSection() {
        return preferenceSection;
    }

    public FlightDetailsSection getFlightDetailsSection() {
        return flightDetailsSection;
    }
}
