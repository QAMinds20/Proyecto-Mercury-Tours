package testCasesMercury;

public class HomePageFlightDetails extends BaseTest {

    @Test(alwaysRun = true, priority = 0)
    @Story("TC21_Home Page - Flights Page_Flight Details_Default fields")
    @Description("Verify default fields are correctly selected when user acces to 'flight page'")
    public void FlightDetailsDefaultFields() {

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC22_Home Page - Flights Page_Flight Details_Radio button")
    @Description("Validate that only one 'Radio button' can be selected and 'Round Trip is the default selection")
    public void FlightDetailsRadioButton() {

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC23_Home Page - Flights Page_Flight Details_Passengers dropdown")
    @Description("Validate that passengers dropdown has 1 to 4 options available and 1 is the default selection")
    public void FlightDetailsPassengersDropdown() {

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC24_Home Page - Flights Page_Flight Details_Departing from dropdown")
    @Description("Validate departing from dropdown works correctly and Acapulco is the default selection")
    public void FlightDetailsDepartingFromDropdown() {

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC25_Home Page - Flights Page_Flight Details_On' dropdowns")
    @Description("Validate 'On' dropdowns work correctly and current date is the default selection")
    public void FlightDetailsDetailsOnDropdowns() {

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC26_Home Page - Flights Page_Flight Details_Arriving In' dropdown")
    @Description("Validate 'Arriving In' dropdown works correctly and 'Frankfurt' is the default selection")
    public void FlightDetailsArrivingInDropdown() {

    }
}
