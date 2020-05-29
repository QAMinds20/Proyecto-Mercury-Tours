package testCasesMercury;

import com.sun.source.doctree.SummaryTree;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import sections.FlightDetailsSection;


public class BookAFlightTestCases extends BaseTest {

    public BookAFlightTestCases(WebDriver driver) {
        super(driver);
    }
    String summaryHeader;

    //@Description("TC35_Book a Flight_Verify_Flight Resume")
    @Test(alwaysRun=true,priority=0)
    public void verifyFlightResume(){


        summaryHeader = "Summary";

        //Step 3 - Verify that all the mandatory fields from the formulary display and this show in red color
        Assert.assertTrue(bk.getSummaryHeader(), summaryHeader);
        Assert.assertTrue(bk.getSummaryDepartureStation(),departureStation);
        Assert.assertTrue(bk.getSummaryDepartureFlight(),departureFlight);
        Assert.assertTrue(bk.getSummaryDepartureClass(),departureClass);
        Assert.assertTrue(bk.getSummaryDeparturePrice(),departurePrice);
        Assert.assertTrue(bk.getSummaryArrivalStation(),arrivalStation);
        Assert.assertTrue(bk.getSummaryArrivalFligh(),arrivalFlight);
        Assert.assertTrue(bk.getSummaryArrivalClass(),arrivalClass);
        Assert.assertTrue(bk.getSummaryArrivalPrice(),arrivalPrice);
    }


    //@Description("TC36_BookFlightPage_Verify_Mandatory Values Presence")
    @Test(alwaysRun=true,priority=0)
    public void verifyMandatoryValuesPresence(){
        Assert.assertTrue(bk.passengerFirstName().getFirstNameLblFontColor().equals("red"),"First Name is not mandatory");
        Assert.assertTrue(bk.passengerLastName().getLastNameLblFontColor().equals("red"),"Last Name is not mandatory");
        Assert.assertTrue(bk.passengerCardNumber().getPhoneLblFontColor().equals("red"),"Number is not mandatory");

    }
    //@Description("TC37_BookFlightPage_Verify_Non mandatory Values Presence")
    @Test(alwaysRun=true,priority=0)
    public void verifyNonMandatoryValuesPresence(){

        Assert.assertTrue(bk.getMealDropdown(), mealDropdown);
        Assert.assertTrue(bk.getMealDropdown(),"No Preference");
        Assert.assertTrue(bk.getSummaryDepartureFlight(),departureFlight);
        Assert.assertTrue(bk.getSummaryDepartureClass(),departureClass);
        Assert.assertTrue(bk.getSummaryDeparturePrice(),departurePrice);
        Assert.assertTrue(bk.getSummaryArrivalStation(),arrivalStation);
        Assert.assertTrue(bk.getSummaryArrivalFligh(),arrivalFlight);
        Assert.assertTrue(bk.getSummaryArrivalClass(),arrivalClass);
        Assert.assertTrue(bk.getSummaryArrivalPrice(),arrivalPrice);

    }
    //@Description("TC38_BookFlightPage_Verify_Secure Purchase All Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseAllFields(){
    }
    //@Description("TC39_BookFlightPage_Verify_Secure Purchase Mandatory Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseMandatoryFields(){
    }
    //@Description("TC40_BookFlightPage_Verify_Secure Purchase Non mandatory Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseNonMandatoryFields(){
    }
    //@Description("TC41_BookFlightPage_Verify_First Name_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyFirstNameBlank(){
    }
    //@Description("TC42_BookFlightPage_Verify_Last Name_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyLastNameBlank(){
    }
    //@Description("TC43_BookFlightPage_Verify_CC Number_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberBlanck(){
    }
    //@Description("TC44_BookFlightPage_Verify_CC Number_Characters_Special")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersSpecial(){
    }
    //@Description("TC45_BookFlightPage_Verify_CC Number_Characters_MinMinus1")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersMinMinus1(){
    }
    //@Description("TC46_BookFlightPage_Verify_CC Number_Characters_MaxPlus1")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersMaxPlus1(){
    }
}
