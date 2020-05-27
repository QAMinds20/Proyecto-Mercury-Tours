package testCasesMercury;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RegisterPage;
import pages.RegisterSuccessPage;
import sections.TopMenuSection;

public class RegisterPageTestCases extends BaseTest{

    RegisterPage rp = new RegisterPage(driver);

    TopMenuSection tms = new TopMenuSection(driver);

    RegisterSuccessPage rsp = new RegisterSuccessPage(driver);

    SoftAssert softAssert = new SoftAssert();

    public static String REGISTER_PAGE_URL = "http://newtours.demoaut.com/mercuryregister.php";
    public static String LOGIN_PAGE_URL = "http://newtours.demoaut.com/mercurysignon.php";

    @Description("TC01_Registration Page_User Registration Mandatory Fields")
    @Test(alwaysRun=true,priority=0)
    public void checkMandatoryFields(){
        //Step 1 - Open browser and from search bar enter the URL: http://newtours.demoaut.com/
        open(driver);

        //Step 2 - From the Top Menu that display at the top click on Register link
        tms.clickOnRegister();

        //Step 3 - Verify that all the mandatory fields from the formulary display and this show in red color
        softAssert.assertTrue(rp.getContactInfoSection().getFirstNameLblFontColor().equals("red"),"First Name is not mandatory");
        softAssert.assertTrue(rp.getContactInfoSection().getLastNameLblFontColor().equals("red"),"Last Name is not mandatory");
        softAssert.assertTrue(rp.getContactInfoSection().getPhoneLblFontColor().equals("red"),"Phone is not mandatory");
        softAssert.assertTrue(rp.getContactInfoSection().getEmailLbFontColor().equals("red"),"Email is not mandatory");
        softAssert.assertTrue(rp.getUserInfoSection().getUserNameLblFontColor().equals("red"),"User Name is not mandatory");
        softAssert.assertTrue(rp.getUserInfoSection().getPasswordLblFontColor().equals("red"),"Password is not mandatory");
        softAssert.assertTrue(rp.getUserInfoSection().getConfirmPasswordFontColor().equals("red"),"ConfirmPassword is not mandatory");

    }

    @Description("TC02_Registration Page_User Mandadory Fields_Submit Formulary-No Information Provide")
    @Test(alwaysRun=true,priority=0)
    public void registeringLeavingAllFieldsBlank(){
        //Step 1 - Open browser and from search bar enter the URL: http://newtours.demoaut.com/ and click enter
        open(driver);

        //Step 2 - From the Top Menu that display at the top click on Register link
        tms.clickOnRegister();

        //Step 3 - Without enter any information at the formulary click on Submit button
        rp.clickOnSubmitButton();

        //If the user is still on the Registration page Mandatory fields are working
        softAssert.assertTrue(driver.getCurrentUrl().equals(REGISTER_PAGE_URL));
    }

    @Description("TC03_Registration Page_User Mandadory Fields_No Required Fields_Submit Register")
    @Test(alwaysRun=true,priority=0)
    public void registeringLeavingMandatoryFieldsBlank(){
        //Step 1 - Open browser and from search bar enter the URL: http://newtours.demoaut.com/ and click enter
        open(driver);

        //Step 2 - From the Top Menu that display at the top click on Register link
        tms.clickOnRegister();

        //Step 3 - Fill the mandatory fields and keep on blank the no mandatory fields, click on Submit button
        rp.getContactInfoSection().setFirstName("FirstName");
        rp.getContactInfoSection().setLastName("LastName");
        rp.getContactInfoSection().setPhone("1234567890");
        rp.getContactInfoSection().setEmail("validemail@hotmail.com");
        rp.getUserInfoSection().setUserName("validUser");
        rp.getUserInfoSection().setPassword("validPassword");
        rp.getUserInfoSection().setConfirmPassword("validPassword");

        rp.clickOnSubmitButton();

        //Validate  your user name display as  <UserName>
        softAssert.assertTrue(rsp.getNoteMsgText().contains("validUser"),"User name is not equals");

    }

    @Description("TC04_Registration Page_User Mandadory Fields and Not Mandatory-Submit")
    @Test(alwaysRun=true,priority=0)
    public void registeringProvidingFullData(){
        //Step 1 - Open browser and from search bar enter the URL: http://newtours.demoaut.com/ and click enter
        open(driver);

        //Step 2 - From the Top Menu that display at the top click on Register link
        tms.clickOnRegister();

        //Step 3 - Fill the mandatory fields and the no mandatory fields, click on Submit button
        rp.getContactInfoSection().setFirstName("FirstName");
        rp.getContactInfoSection().setLastName("LastName");
        rp.getContactInfoSection().setPhone("1234567890");
        rp.getContactInfoSection().setEmail("validemail@hotmail.com");
        rp.getMailingInformationSection().setAddress("Principal Street");
        rp.getMailingInformationSection().setCity("Guadalajara");
        rp.getMailingInformationSection().setPostalCode("12345");
        rp.getMailingInformationSection().selectCountryByName("MEXICO");
        rp.getUserInfoSection().setUserName("validUSer");
        rp.getUserInfoSection().setPassword("validPassword");
        rp.getUserInfoSection().setConfirmPassword("validPassword");

        rp.clickOnSubmitButton();

        //Step 4 - Valitate  your user name display as  <User Name>
        softAssert.assertTrue(rsp.getNoteMsgText().contains("validUser"),"User name is not equals");
    }

    @Description("TC05_Registration Page_Sign In Link")
    @Test(alwaysRun=true,priority=0)
    public void verifySignInLink(){
        //Step 1 - Open browser and from search bar enter the URL: http://newtours.demoaut.com/ and click enter
        open(driver);

        //Step 2 - From the Top Menu that display at the top click on Register link
        tms.clickOnRegister();

        //Step 3 - Fill the mandatory fields and the no mandatory fields, click on Submit button
        rp.getContactInfoSection().setFirstName("FirstName");
        rp.getContactInfoSection().setLastName("LastName");
        rp.getContactInfoSection().setPhone("1234567890");
        rp.getContactInfoSection().setEmail("validemail@hotmail.com");
        rp.getMailingInformationSection().setAddress("Principal Street");
        rp.getMailingInformationSection().setCity("Guadalajara");
        rp.getMailingInformationSection().setPostalCode("12345");
        rp.getMailingInformationSection().selectCountryByName("MEXICO");
        rp.getUserInfoSection().setUserName("validUSer");
        rp.getUserInfoSection().setPassword("validPassword");
        rp.getUserInfoSection().setConfirmPassword("validPassword");

        rp.clickOnSubmitButton();

        //Step 4 - Click on on Sign-In  link
        rsp.clickOnSingOn();

        //Validate user is redirected tp Login Page
        softAssert.assertTrue(driver.getCurrentUrl().equals(LOGIN_PAGE_URL));
    }

}