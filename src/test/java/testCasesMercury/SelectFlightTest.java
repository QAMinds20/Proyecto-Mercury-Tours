package testCasesMercury;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FlightFinderPage;
import pages.HomePage;
import pages.SelectFlightPage;
import sections.FlightDetailsSection;
import sections.LeftMenuSection;

import java.util.logging.Logger;

public class SelectFlightTest extends BaseTest {

    HomePage homePage = new HomePage(driver);
    RegisterPageTestCases registerPage = new RegisterPageTestCases(driver);
    SingInPageTest singInPage = new SingInPageTest(driver);
    LeftMenuSection leftMenuSection = new LeftMenuSection(driver);
    FlightFinderPage flightFinderPage = new FlightFinderPage(driver);
    SelectFlightPage selectAFlight = new SelectFlightPage(driver);
    FlightDetailsSection flightDetailsSection = new FlightDetailsSection(driver);
    SoftAssert softAssertion = new SoftAssert();

    public SelectFlightTest(WebDriver driver) {
        super(driver);
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        //Open page
        open(driver);
        //Call method register/login
        Logger.getLogger("User Register");
        registerPage.registeringProvidingFullData();
        singInPage.validateLoginFunctionality();
        //Call method to select a flight (Flight Finder page)
        leftMenuSection.clickOnFlights();
        //Call method to click on continue (Flight Finder page)
        flightFinderPage.clickOnContinue();
    }

    @Description("TC31_Home Page - Select Flight_Only one option is allowed to select on Service Class section")
    @Test(alwaysRun = true, priority = 0)
    public void validateOnlyOneOptionIsAllowedToSelectOnServiceClassSection() {

        //Verify actual page is "Select a Flight page"
        Assert.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Time
        selectAFlight.selectAFlightByTime("DEPART", "7:10");
        //Verify other options on Depart section are not selected

    }

    @Description("TC32_Home Page - Select Flight_Only one option is allowed to select on Airline dropdown")
    @Test(alwaysRun = true, priority = 0)
    public void validateOnlyOneOptionIsAllowedToSelectOnAirlineDropdown() {

        //Verify actual page is "Select a Flight page"
        softAssertion.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Price
        selectAFlight.selectAFlightByPrice("RETURN", "274");
        //Verify other options on Return sections are not selected

    }

    @Description("TC33_Home Page - Select Flight_Preferences default options")
    @Test(alwaysRun = true, priority = 0)
    public void validatePreferencesDefaultOptions() {

        //Verify actual page is "Select a Flight page"
        softAssertion.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");

        //Verify first option is selected by default
        softAssertion.assertTrue(flightDetailsSection.getTripType().isEnabled(),"'Type' button is not available");
    }

    @Description("TC34_Home Page - Select Flight_Select Continue button")
    @Test(alwaysRun = true, priority = 0)
    public void validateSelectContinueButton() {

        //Verify actual page is "Select a Flight page"
        softAssertion.assertEquals(driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
        //Select a depart flight by Airline
        selectAFlight.selectAFlightByAirline("DEPART", "Unified Airlines 363");
        //Select a return flight by Airline
        selectAFlight.selectAFlightByAirline("RETURN", "Unified Airlines 633");
        //Verify continue button is displayed
        softAssertion.assertTrue(selectAFlight.continueButtonIsAvailableAndEnable(driver));
        //Click on continue button
        selectAFlight.clickOnContinue(driver);
        //Verify page is displayed
    }
}
