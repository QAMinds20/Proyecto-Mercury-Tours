package testCasesMercury;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SelectFlightPage;
import sections.FlightDetailsSection;

public class SelectFlightTest extends BaseTest {

    HomePage homePage = new HomePage(driver);
    FlightDetailsSection flightDetailsSection = new FlightDetailsSection(driver);
    SoftAssert softAssertion = new SoftAssert();

    SelectFlightPage selectAFlight = new SelectFlightPage(driver);

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        //Open page
        open(driver);
        //Call method register/login
        //Call method to select a flight (Flight Finder page)
        //Call method to click on continue (Flight Finder page)
    }

    @Description("TC31_Home Page - Select Flight_Only one option is allowed to select on Service Class section")
    @Test(alwaysRun = true, priority = 0)
    public void validateOnlyOneOptionIsAllowedToSelectOnServiceClassSection() {

        //Verify actual page is "Select a Flight page"
        Assert.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Date
        selectAFlight.selectAFlightByTime();
        //Verify other options are not selected
        Assert.assertEquals(driver.getCurrentUrl(), selectAFlight.getURL;

    }

    @Description("TC32_Home Page - Select Flight_Only one option is allowed to select on Airline dropdown")
    @Test(alwaysRun = true, priority = 0)
    public void validateOnlyOneOptionIsAllowedToSelectOnAirlineDropdown() {

        //Verify actual page is "Select a Flight page"
        Assert.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Date
        selectAFlight.selectAFlightByTime();

    }

    @Description("TC33_Home Page - Select Flight_Preferences default options")
    @Test(alwaysRun = true, priority = 0)
    public void validatePreferencesDefaultOptions() {

        //Verify actual page is "Select a Flight page"
        Assert.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");

        //Verify first option is selected by default
        softAssertion.assertTrue(flightDetailsSection.getTripType().isEnabled(),"'Type' button is not available");
    }

    @Description("TC34_Home Page - Select Flight_Select Continue button")
    @Test(alwaysRun = true, priority = 0)
    public void validateSelectContinueButton() {

        //Verify actual page is "Select a Flight page"
        Assert.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Date
        selectAFlight.selectAFlightByTime();
        //Select a return flight by Time
        selectAFlight.selectAFlightByTime();
        //Verify continue button is displayed
        //Assert.assertEquals(validateSelectContinueButton());

    }
}
