package testCasesMercury;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sections.LeftMenuSection;
import pages.SignonPage;

//REQ03 Home Page - Left Menu

public class LeftMenuTestCases extends BaseTest{

    LeftMenuSection lms = new LeftMenuSection(driver);
    SignonPage sp = new SignonPage(driver);

    SoftAssert softAssertion = new SoftAssert();

    String pagesURL;

    public LeftMenuTestCases(WebDriver driver) {
        super(driver);
    }

    //Allure Description, please uncomment after add to the POM file
    @Description("TC12_Home Page - Left Menu_User is redirected to Flights Page")

    @Test(alwaysRun = true, priority = 0)
    public void validateUserLoggedRedirectedFlightFinderPage(){
        //Step 1 - go to Go to 'http://newtours.demoaut.com/'
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link
        sp.clickOnSingOn();

        //Step 3 - Insert a valid <User Name> on "User Name" field
       sp.enterUser("");

        //Step 4 - Introduce the "Password"
       sp.enterPassword("");

        //Step 5  - Click on "SUBMIT" button
        sp.clickOnSubmit();


        //Step 6 - Click on Flights link placed in the left ide of the page, under Home link
        lms.clickOnFlights();


        //Expected - User is redirected to Flight Finder page
        pagesURL="http://newtours.demoaut.com/mercuryreservation.php";
        softAssertion.assertEquals(this.driver.getCurrentUrl(), pagesURL);

        WebElement title = driver.findElement(By.xpath(".//td/img[contains(@src, '/images/masts/mast_flightfinder.gif')]"));
        softAssertion.assertEquals(title.isDisplayed(),true);



    }
    //Allure Description, please uncomment after add to the POM file
    @Description("TC13_Home Page - Left Menu_User is redirected to Cruises Page")
    @Test(alwaysRun = true, priority = 0)
    public void validateUserLoggedRedirectedCruiseSpecialPage(){
        //Step 1 - go to Go to 'http://newtours.demoaut.com/'
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link
        sp.clickOnSingOn();

        //Step 3 - Insert a valid <User Name> on "User Name" field
        sp.enterUser("");

        //Step 4 - Introduce the "Password"
        sp.enterPassword("");

        //Step 5  - Click on "SUBMIT" button
        sp.clickOnSubmit();

        //Step 6 - Click on Cruises link placed in the left ide of the page, under Car Rentals link
        lms.clickOnCruises();


        //Expected - User is redirected to Cruises Special page
        pagesURL= "http://newtours.demoaut.com/mercurycruise.php";
        softAssertion.assertEquals(this.driver.getCurrentUrl(), pagesURL);

        WebElement title = driver.findElement(By.xpath(".//td/img[contains(@src, '/images/masts/cruise_special.gif')]"));
        softAssertion.assertEquals(title.isDisplayed(),true);

    }
    //Allure Description, please uncomment after add to the POM file
    @Description("TC14_Home Page - Left MenuUser open Flights and Cruise at the same tame")
    @Test(alwaysRun = true, priority = 0)
    public void validateUserLoggedRedirectedAbleSeeBoutPages(){
        //Step 1 - go to Go to 'http://newtours.demoaut.com/'
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link
        sp.clickOnSingOn();

        //Step 3 - Insert a valid <User Name> on "User Name" field
        sp.enterUser("");

        //Step 4 - Introduce the "Password"
        sp.enterPassword("");

        //Step 5  - Click on "SUBMIT" button
        sp.clickOnSubmit();

        //Step 6 - Click right click on Cruises link placed in the left ide of the page, under Car Rentals link. Open the page in other tab
        lms.clickOnCruises();

        //Expected - User is redirected to Cruises Special page
        pagesURL= "http://newtours.demoaut.com/mercurycruise.php";
        softAssertion.assertEquals(this.driver.getCurrentUrl(), pagesURL);

        //Step 7 - Click right click on Flights link placed in the left ide of the page, under Car Rentals link. Open the page in other tab
        lms.clickOnFlights();
        
        //Expected - User is redirected to Cruises Special page
        pagesURL= "http://newtours.demoaut.com/mercurycruise.php";
        softAssertion.assertEquals(this.driver.getCurrentUrl(), pagesURL);

        WebElement title = driver.findElement(By.xpath(".//td/img[contains(@src, '/images/masts/cruise_special.gif')]"));
        softAssertion.assertEquals(title.isDisplayed(),true);

    }
    //Allure Description, please uncomment after add to the POM file
    @Description("TC15_Home Page - Left Menu_Prospect is redirected to Cruises Page")
    @Test(alwaysRun = true, priority = 0)
    public void validateProspectRedirectedCruiseSocialPage(){
        //Step 1 - go to Go to 'http://newtours.demoaut.com/'
        open(this.driver);


        //Step 2 - Click on Cruises link placed in the left ide of the page, under Car Rentals link
        lms.clickOnCruises();


        //Expected - User is redirected to Cruises Special page
        pagesURL= "http://newtours.demoaut.com/mercurycruise.php";
        softAssertion.assertEquals(this.driver.getCurrentUrl(), pagesURL);
        WebElement title = driver.findElement(By.xpath(".//td/img[contains(@src, '/images/masts/cruise_special.gif')]"));

        softAssertion.assertEquals(title.isDisplayed(),true);
    }
}
