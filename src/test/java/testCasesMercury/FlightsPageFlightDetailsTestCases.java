package testCasesMercury;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import sections.FlightDetailsSection;
import sections.LeftMenuSection;


public class FlightsPageFlightDetailsTestCases extends BaseTest {

    LeftMenuSection leftMenuSection = new LeftMenuSection(driver);
    FlightDetailsSection flightDetailsSection = new FlightDetailsSection(driver);
    SoftAssert softAssertion = new SoftAssert();

    @Description("TC21_Home Page - Flights Page_Flight Details_Default fields")
    @Test(alwaysRun=true,priority=0)
    public void verifyDefaultFields(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Validate 'Type' radio button is present
        softAssertion.assertTrue(flightDetailsSection.getTripType().isEnabled(),"'Type' button is not available");

        //Validate 'Passengers' dropdown is present
        softAssertion.assertTrue(flightDetailsSection.getPassengersCount().isDisplayed(),"Passengers dropdown is not available");

        //Validate 'Departing' From dropdown is present
        softAssertion.assertTrue(flightDetailsSection.getDepartingFrom().isDisplayed(),"'Departing From' dropdown is not available");

        //Validate 'On' dropdown for month is present
        softAssertion.assertTrue(flightDetailsSection.getMonthOn().isDisplayed(),"'On' month dropdown is not available");

        //Validate 'On' dropdown for day is present
        softAssertion.assertTrue(flightDetailsSection.getDayOn().isDisplayed(),"'On' day dropdown is not available");

        //Validate 'Arriving In' dropdown is present
        softAssertion.assertTrue(flightDetailsSection.getArrivingIn().isDisplayed(), "'Arriving In' dropdown is not available");

        //Validate 'Returning' dropdown for month is present
        softAssertion.assertTrue(flightDetailsSection.getMonthReturn().isDisplayed(),"'Returning' month dropdown is not available");

        //Validate 'Returning' dropdown for day is present
        softAssertion.assertTrue(flightDetailsSection.getDayReturn().isDisplayed(),"'Returning' day dropdown is not available");
    }

    @Description("TC22_Home Page - Flights Page_Flight Details_Radio button")
    @Test(alwaysRun=true,priority=0)
    public void validateRadioButtonTrip(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select the radio button
        flightDetailsSection.clickOnType();
    }

    @Description("TC23_Home Page - Flights Page_Flight Details_Passengers dropdown")
    @Test(alwaysRun=true,priority=0)
    public void  validatePassengerDropdown(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select 'Passengers' dropdown and verify displayed option is '1'
        softAssertion.assertTrue(flightDetailsSection.getFirstPassengerSelectedOption().equals("1"), "1 is not the default selection");

        ////Select 'Passengers' dropdown and verify that 4 is the last option available
        softAssertion.assertTrue(flightDetailsSection.getLastPassengerSelectedOption().equals("4"),"4 is not the default selection");
    }

    @Description("TC24_Home Page - Flights Page_Flight Details_Departing from dropdown")
    @Test(alwaysRun=true,priority=0)
    public void  validateDepartingDropdown(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select 'Departing From' dropdown and verify displayed option is 'Acapulco'
        softAssertion.assertTrue(flightDetailsSection.getdepartingFromSelectedOption().equals("Acapulco"),"Acapulco is not the default selection");
    }

    @Description("TC25_Home Page - Flights Page_Flight Details_On' dropdowns")
    @Test(alwaysRun=true,priority=0)
    public void  validateOnMonthDay(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select 'On' dropdown for month and verify displayed option is 'May'
        softAssertion.assertTrue(flightDetailsSection.getmonthOnSelectedOption().equals("May"),"May is not the default selection");

        //Select 'On' dropdown for day and verify displayed option is '30'
        softAssertion.assertTrue(flightDetailsSection.getdayOnSelectedOption().equals("30"),"30 is not the default selection");

    }

    @Description("TC26_Home Page - Flights Page_Flight Details_Arriving In' dropdown")
    @Test(alwaysRun=true,priority=0)
    public void  validateArrivingDropdown(){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select 'Arriving In' dropdown and verify displayed option is 'Frankfurt'
        softAssertion.assertTrue(flightDetailsSection.getarrivingInSelectedOption().equals("Frankfurt"),"Frankfurt is not the default selection");
    }

    @Description("Returning' dropdown")
     @Test(alwaysRun=true,priority=0)
    public void returningDropdown (){

        //Navigate to Flights page
        leftMenuSection.clickOnFlights();

        //Select 'On' dropdown for month and verify displayed option is 'May'
        softAssertion.assertTrue(flightDetailsSection.getmonthReturnSelectedOption().equals("May"),"May is not the default selection");

        //Select 'On' dropdown for day and verify displayed option is '30'
        softAssertion.assertTrue(flightDetailsSection.getdayReturnSelectedOption().equals("30"),"30 is not the default selection");
    }

}
