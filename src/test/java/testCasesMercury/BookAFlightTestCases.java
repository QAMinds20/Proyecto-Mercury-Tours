package testCasesMercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import sections.BookAFlightSection;
import sections.FlightDetailsSection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BookAFlightTestCases extends BaseTest {

    BookAFlightSection bookAFlightSection = new BookAFlightSection(driver);
    String summaryHeader;

    public BookAFlightTestCases(WebDriver driver) {
        super(driver);
    }

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
        Assert.assertTrue(bk.passengerCardNumber().getCardNumberLblFontColor().equals("red"),"Number is not mandatory");

    }
    //@Description("TC37_BookFlightPage_Verify_Non mandatory Values Presence")
    @Test(alwaysRun=true,priority=0)
    public void verifyNonMandatoryValuesPresence(){

        Assert.assertTrue(bk.getMealDropdown(), mealDropdown);
        Assert.assertTrue(bk.getMealDropdown(),"No Preference");
        Assert.assertTrue(bk.getPassengerCardType(), passengerCardType);
        Assert.assertTrue(bk.getBillingAddressCheckbox(),billingAddressCheckbox);
        Assert.assertTrue(bk.getCheckboxUnchecked(),checkboxUnchecked);
        Assert.assertTrue(bk.getSummaryArrivalStation(),arrivalStation);
        Assert.assertTrue(bk.getSummaryArrivalFligh(),arrivalFlight);
        Assert.assertTrue(bk.getSummaryArrivalClass(),arrivalClass);
        Assert.assertTrue(bk.getSummaryArrivalPrice(),arrivalPrice);

    }
    //@Description("TC38_BookFlightPage_Verify_Secure Purchase All Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseAllFields(){
        bookAFlightSection.setLastName("admin");
        bookAFlightSection.setLastName("admin");
        bookAFlightSection.selectMeal("No preference");
        bookAFlightSection.cardType("American Express");
        bookAFlightSection.cardNumber("");
        bookAFlightSection.expiration1("");
        bookAFlightSection.expiration2("");
        bookAFlightSection.firstCardName("");
        bookAFlightSection.middleCardName("");
        bookAFlightSection.lastCardName("");

        //Billing Address
        bookAFlightSection.billingAddress("");
        bookAFlightSection.billingCity("");
        bookAFlightSection.billingState("");
        bookAFlightSection.billingPostalCode("");
        bookAFlightSection.selectBillingCountry("");

        //DElivery Address
        bookAFlightSection.deliveryAddress("");
        bookAFlightSection.deliveryCity("");
        bookAFlightSection.deliveryState("");
        bookAFlightSection.deliveryPostalCode("");
        bookAFlightSection.selectDeliveryCountry("");

        bookAFlightSection.securePurchaseBtn().click();

    }
    //@Description("TC39_BookFlightPage_Verify_Secure Purchase Mandatory Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseMandatoryFields(){ //This test case is the same as the last one, don't apply
        WebElement booked = driver.findElement(By.xpath("//font[contains(@size, '+1')]"));
        Assert.assertEquals(booked, "Your itinerary has been booked!");

    }
    //@Description("TC40_BookFlightPage_Verify_Secure Purchase Non mandatory Fields")
    @Test(alwaysRun=true,priority=0)
    public void verifySecurePurchaseNonMandatoryFields(){
        WebElement booked = driver.findElement(By.xpath("//font[contains(@size, '+1')]"));
        if (!booked.isDisplayed()) {
            System.out.println("ERROR!" + errorMessage);
        }else {
            Assert.assertEquals(booked, true);
        }

    }
    //@Description("TC41_BookFlightPage_Verify_First Name_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyFirstNameBlank(){
        WebElement firstName = driver.findElement(By.name("passFirst0"));
        String textInsideInput = firstName.getAttribute("value");
        if (textInsideInput.isEmpty()) {
            System.out.println("Input field is empty, please type some value");
        } else {
            bookAFlightSection.securePurchaseBtn.click();
            WebElement booked = driver.findElement(By.xpath("//font[contains(@size, '+1')]"));
            Assert.assertEquals(booked, true);
        }
    }
    //@Description("TC42_BookFlightPage_Verify_Last Name_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyLastNameBlank(){
        WebElement lastName = driver.findElement(By.name("passLast0"));
        String textInsideInputLast = lastName.getAttribute("value");
        if (textInsideInputLast.isEmpty()) {
            System.out.println("Input field is empty, please type some value");
        } else {
            bookAFlightSection.securePurchaseBtn.click();
            WebElement booked = driver.findElement(By.xpath("//font[contains(@size, '+1')]"));
            Assert.assertEquals(booked, true);
        }
    }
    //@Description("TC43_BookFlightPage_Verify_CC Number_Blank")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberBlank(){
        WebElement cardNumber = driver.findElement(By.name("creditnumber"));
        String textInsideInputCard = cardNumber.getAttribute("value");
        if (textInsideInputCard.isEmpty()) {
            System.out.println("Input field is empty, please type some value");
        } else {
            bookAFlightSection.securePurchaseBtn.click();
            WebElement booked = driver.findElement(By.xpath("//font[contains(@size, '+1')]"));
            Assert.assertEquals(booked, true);
        }
    }
    //@Description("TC44_BookFlightPage_Verify_CC Number_Characters_Special")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersSpecial(){
        Pattern p = Pattern.compile("[0-9]{16}", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Contains only numbers");
        boolean cardNumber = m.find();

        if (cardNumber)
            System.out.println("This input does not allowed special characters, please enter valid data.");
    }
    //@Description("TC45_BookFlightPage_Verify_CC Number_Characters_MinMinus1")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersMinMinus1(){
        Pattern p = Pattern.compile("[0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Contains only numbers");
        boolean cardNumber = m.find();

        if (cardNumber)
            System.out.println("Minus chracter is not allowed, you have to type 16 characters.");
    }
    //@Description("TC46_BookFlightPage_Verify_CC Number_Characters_MaxPlus1")
    @Test(alwaysRun=true,priority=0)
    public void verifyCCNumberCharactersMaxPlus1(){
        Pattern p = Pattern.compile("[0-9]{16}", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Contains only numbers");
        boolean cardNumber = m.find();

        if (cardNumber)
            System.out.println("Please enter 16 characters");
    }
}
