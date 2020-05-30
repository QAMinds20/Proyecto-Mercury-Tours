package testCasesMercury;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RegisterSuccessPage;
import pages.SignonPage;
import sections.TopMenuSection;

public class SpecialsSection extends BaseTest {

    SignonPage signOn = new SignonPage(driver);
    RegisterSuccessPage reg = new RegisterSuccessPage(driver);
    TopMenuSection supportLinks = new TopMenuSection(driver);

    SoftAssert softAssertion = new SoftAssert();

    String soWelcomeMessage;
    String regMessage;


    public SpecialsSection(WebDriver driver) {
        super(driver);
    }

    @Test(alwaysRun = true, priority = 0)
    /*@Severity(SeverityLevel.BLOCKER)
    @Description("TC16_Home Page - Top Menu_Specials Section_Validate 'Welcome Message'")*/
    public void validateWelcomeMessage(){
        //Step 1 - Go to 'http://newtours.demoaut.com/'
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link
        signOn.clickOnSingOn();

        //Step 3 - Validate 'Welcome Message'
        soWelcomeMessage = "Welcome back to Mercury Tours! "
                +"Enter your user information to access the member-only areas of "
                +"this site. If you don't have a log-in, please fill out the "
                +"registration form.";

        softAssertion.assertEquals(signOn.getWelcomeMessage(), soWelcomeMessage);


    }

    @Test(alwaysRun = true, priority = 1)
    /*@Severity(SeverityLevel.BLOCKER)
    @Description("TC17_Home Page - Top Menu_Specials Section_Validate 'Registration Message'")*/
    public void validateRegistrationMessage(){
        //Step 1 - Go to 'http://newtours.demoaut.com/'
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link
        signOn.clickOnRegistrationLink();

        //Step 3 - Validate 'Welcome Message'
        regMessage = "To create your account, " +
                "we'll need some basic information about you. " +
                "This information will be used to send reservation confirmation emails, " +
                "mail tickets when needed and contact you if your travel arrangements change. " +
                "Please fill in the form completely.";

        softAssertion.assertEquals(reg.getSuccessMsgText(), regMessage);


    }

    @Test(alwaysRun = true, priority = 2)
    /*@Severity(SeverityLevel.BLOCKER)
    @Description("TC18_Home Page - Top Menu_Specials Section_Validate 'Under Construction Message' from Support Link")*/
    public void validateSupportUnderConstructionMessage(){
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link.
        supportLinks.clickOnSupport();

        //Step 3 - Validate 'Welcome Message'.This is only demo, there is Not a Welcome message method for this link.
        soWelcomeMessage = "This section of our web site is currently under construction.   Sorry for any inconvienece.";

        softAssertion.assertEquals(signOn.getWelcomeMessage(), soWelcomeMessage);

    }

    @Test(alwaysRun = true, priority = 3)
    /*@Severity(SeverityLevel.BLOCKER)
    @Description("TC19_Home Page - Top Menu_Specials Section_Validate 'Under Construction Message' from Contact Link")*/
    public void validateContactUnderConstructionMessage(){
        open(this.driver);

        //Step 2 - Click on 'SING-ON' Link.
        supportLinks.clickOnSupport();

        //Step 3 - Validate 'Welcome Message'.This is only demo, there is Not a Welcome message method for this link.
        soWelcomeMessage = "This section of our web site is currently under construction.   Sorry for any inconvienece.";

        softAssertion.assertEquals(signOn.getWelcomeMessage(), soWelcomeMessage);

    }


    @Test(alwaysRun = true, priority = 4)
    /*@Severity(SeverityLevel.BLOCKER)
    @Description("TC20_Home Page - Top Menu_Specials Section_Validate "Special Section"")*/
    public void validateSpecialSection(){


    }

}
